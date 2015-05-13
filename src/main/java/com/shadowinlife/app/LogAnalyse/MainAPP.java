package com.shadowinlife.app.LogAnalyse;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.PairFunction;
import org.apache.spark.sql.hive.HiveContext;

import com.shadowinlife.app.LogAnalyse.ProcessTableSQL.AcountProcessTable;
import com.shadowinlife.app.OssTableSQL.UserAccountAnalysis;

import scala.Tuple2;

/**
 * @author shadowinlife
 * @since 2014-04-03
 * 
 *        Main class of the analyse app
 */

public class MainAPP {

    public static void main(String[] args) {
        if (args.length < 4) {
            System.out
                    .println("args[0]---FileTarget \n args[1]----mode \n args[2]---TableName \n  args[3]----date");
        }

        // Assemble path of the origin log files
        String nameNode = args[0]; /* hdfs://namenode:8020/ */
        String mode = args[1];
        String tableName = args[2];
        String date = "20" + args[3];
        String targetFile = nameNode + "/logsplit/*/" + tableName + date + "/*";
        SparkConf conf = new SparkConf().setAppName("Log Analyzer");
        JavaSparkContext sc = new JavaSparkContext(conf);
        HiveContext sqlContext = new HiveContext(sc.sc());
        System.out.println("gongmeng " + targetFile);
        // check log file path to alter if the file existed
        /*
         * 
         * 
         * try { Configuration hdfsConf = new Configuration(true); FileSystem fs
         * = FileSystem.get(hdfsConf); Path logfile_Path = new Path("");
         * 
         * if (!fs.isDirectory(logfile_Path)) {
         * System.out.println("gongmeng 1");
         * AcountProcessTable.ModifyProcessTableWithoutLogFile(sqlContext,
         * date); return; } } catch (IOException e1) { e1.printStackTrace(); }
         */
        try {
            // Read origin log file
            JavaRDD<String> logLines = sc.textFile(targetFile);

            // TODO The algorithm used to split the file should be changed

            // Split origin file into key-value model
            JavaPairRDD<String, String[]> hadoopFile = logLines
                    .mapToPair(new PairFunction<String, String, String[]>() {
                        private static final long serialVersionUID = 1L;

                        @Override
                        public Tuple2<String, String[]> call(String line) throws Exception {
                            FileSplit temp = FileSplit.parseFromLogFile(line);
                            return new Tuple2<String, String[]>(temp.getKeyName(), temp
                                    .getLineValues());
                        }
                    });

            // Filter origin file into different RDD
            
            JavaRDD<String[]> roleLoginRDD = hadoopFile.filter(
                    new Function<Tuple2<String, String[]>, Boolean>() {

                        private static final long serialVersionUID = 1L;

                        @Override
                        public Boolean call(Tuple2<String, String[]> f) throws Exception {
                            if (!f._1.contains("RoleLogout")) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    }).values();
            
            
            JavaRDD<String[]> roleLogoutRDD = hadoopFile.filter(
                    new Function<Tuple2<String, String[]>, Boolean>() {
                        private static final long serialVersionUID = 1L;

                        @Override
                        public Boolean call(Tuple2<String, String[]> f) throws Exception {
                            if (f._1.contains("RoleLogout")) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    }).values();
            
            AcountProcessTable.process(sqlContext, roleLoginRDD, roleLogoutRDD, date);

            UserAccountAnalysis.create_tbRegisterUser(sqlContext, mode, date);

        } catch (NullPointerException e) {
            AcountProcessTable.process(sqlContext, null, null, date);
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.stop();
        sc.close();
    }
}