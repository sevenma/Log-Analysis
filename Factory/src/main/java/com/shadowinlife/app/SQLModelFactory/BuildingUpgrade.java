package com.shadowinlife.app.SQLModelFactory;
import java.io.*;
import java.sql.*;

public class BuildingUpgrade extends BaseBean implements Serializable {
    public BuildingUpgrade() {
        super();
    }
    private Long iAccountType;
    private Long iGameId;
    private Long iWorldId;
    public Long getiAccountType() {
        return iAccountType;
    }
    public Long getiGameId() {
        return iGameId;
    }
    public Long getiWorldId() {
        return iWorldId;
    }
    public void setiAccountType(Long iAccountType) {
        this.iAccountType = iAccountType;
    }
    public void setiGameId(Long iGameId) {
        this.iGameId = iGameId;
    }
    public void setiWorldId(Long iWorldId) {
        this.iWorldId = iWorldId;
    }
    private Timestamp dtEventTime;
    public void setdtEventTime(Timestamp dtEventTime){
        this.dtEventTime=dtEventTime;
    }
   public Timestamp getdtEventTime() {
        return dtEventTime;
    }

    private Long iEventId;
    public void setiEventId(Long iEventId){
        this.iEventId=iEventId;
    }
   public Long getiEventId() {
        return iEventId;
    }

    private String vVersionId;
    public void setvVersionId(String vVersionId){
        this.vVersionId=vVersionId;
    }
   public String getvVersionId() {
        return vVersionId;
    }

    private String vUin;
    public void setvUin(String vUin){
        this.vUin=vUin;
    }
   public String getvUin() {
        return vUin;
    }

    private Long iRoleId;
    public void setiRoleId(Long iRoleId){
        this.iRoleId=iRoleId;
    }
   public Long getiRoleId() {
        return iRoleId;
    }

    private String vRoleName;
    public void setvRoleName(String vRoleName){
        this.vRoleName=vRoleName;
    }
   public String getvRoleName() {
        return vRoleName;
    }

    private Long iRoleJob;
    public void setiRoleJob(Long iRoleJob){
        this.iRoleJob=iRoleJob;
    }
   public Long getiRoleJob() {
        return iRoleJob;
    }

    private Long iRoleGender;
    public void setiRoleGender(Long iRoleGender){
        this.iRoleGender=iRoleGender;
    }
   public Long getiRoleGender() {
        return iRoleGender;
    }

    private Long iRoleLevel;
    public void setiRoleLevel(Long iRoleLevel){
        this.iRoleLevel=iRoleLevel;
    }
   public Long getiRoleLevel() {
        return iRoleLevel;
    }

    private Long iRoleVipLevel;
    public void setiRoleVipLevel(Long iRoleVipLevel){
        this.iRoleVipLevel=iRoleVipLevel;
    }
   public Long getiRoleVipLevel() {
        return iRoleVipLevel;
    }

    private Long iRoleReputationLevel;
    public void setiRoleReputationLevel(Long iRoleReputationLevel){
        this.iRoleReputationLevel=iRoleReputationLevel;
    }
   public Long getiRoleReputationLevel() {
        return iRoleReputationLevel;
    }

    private String vRoleElse1;
    public void setvRoleElse1(String vRoleElse1){
        this.vRoleElse1=vRoleElse1;
    }
   public String getvRoleElse1() {
        return vRoleElse1;
    }

    private String vRoleElse2;
    public void setvRoleElse2(String vRoleElse2){
        this.vRoleElse2=vRoleElse2;
    }
   public String getvRoleElse2() {
        return vRoleElse2;
    }

    private Long iRoleExperience;
    public void setiRoleExperience(Long iRoleExperience){
        this.iRoleExperience=iRoleExperience;
    }
   public Long getiRoleExperience() {
        return iRoleExperience;
    }

    private Long iRoleSword;
    public void setiRoleSword(Long iRoleSword){
        this.iRoleSword=iRoleSword;
    }
   public Long getiRoleSword() {
        return iRoleSword;
    }

    private Long iPartyId;
    public void setiPartyId(Long iPartyId){
        this.iPartyId=iPartyId;
    }
   public Long getiPartyId() {
        return iPartyId;
    }

    private String vPartyName;
    public void setvPartyName(String vPartyName){
        this.vPartyName=vPartyName;
    }
   public String getvPartyName() {
        return vPartyName;
    }

    private Long iPartyLevel;
    public void setiPartyLevel(Long iPartyLevel){
        this.iPartyLevel=iPartyLevel;
    }
   public Long getiPartyLevel() {
        return iPartyLevel;
    }

    private Long iBuildingParty;
    public void setiBuildingParty(Long iBuildingParty){
        this.iBuildingParty=iBuildingParty;
    }
   public Long getiBuildingParty() {
        return iBuildingParty;
    }

    private Long iUpgrateBulidingId;
    public void setiUpgrateBulidingId(Long iUpgrateBulidingId){
        this.iUpgrateBulidingId=iUpgrateBulidingId;
    }
   public Long getiUpgrateBulidingId() {
        return iUpgrateBulidingId;
    }

    private String vUpgrateBulidingName;
    public void setvUpgrateBulidingName(String vUpgrateBulidingName){
        this.vUpgrateBulidingName=vUpgrateBulidingName;
    }
   public String getvUpgrateBulidingName() {
        return vUpgrateBulidingName;
    }

    private Long iBulidingLevel;
    public void setiBulidingLevel(Long iBulidingLevel){
        this.iBulidingLevel=iBulidingLevel;
    }
   public Long getiBulidingLevel() {
        return iBulidingLevel;
    }

    private Long iUpgrateCostParty;
    public void setiUpgrateCostParty(Long iUpgrateCostParty){
        this.iUpgrateCostParty=iUpgrateCostParty;
    }
   public Long getiUpgrateCostParty() {
        return iUpgrateCostParty;
    }

    private String jUpgrateCostMoney;
    public void setjUpgrateCostMoney(String jUpgrateCostMoney){
        this.jUpgrateCostMoney=jUpgrateCostMoney;
    }
   public String getjUpgrateCostMoney() {
        return jUpgrateCostMoney;
    }

    private String jPartyLeftMoney;
    public void setjPartyLeftMoney(String jPartyLeftMoney){
        this.jPartyLeftMoney=jPartyLeftMoney;
    }
   public String getjPartyLeftMoney() {
        return jPartyLeftMoney;
    }

    private Long iPartyLeftPolity;
    public void setiPartyLeftPolity(Long iPartyLeftPolity){
        this.iPartyLeftPolity=iPartyLeftPolity;
    }
   public Long getiPartyLeftPolity() {
        return iPartyLeftPolity;
    }

    private Long iCostTime;
    public void setiCostTime(Long iCostTime){
        this.iCostTime=iCostTime;
    }
   public Long getiCostTime() {
        return iCostTime;
    }

    private Timestamp dtEventEndTime;
    public void setdtEventEndTime(Timestamp dtEventEndTime){
        this.dtEventEndTime=dtEventEndTime;
    }
   public Timestamp getdtEventEndTime() {
        return dtEventEndTime;
    }

    public BuildingUpgrade parseFromLogFile(String[] args, String GameId, String AccountType, String WorldId){
        return new BuildingUpgrade(GameId, AccountType, WorldId, args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8],args[9],args[10],args[11],args[12],args[13],args[14],args[15],args[16],args[17],args[18],args[19],args[20],args[21],args[22],args[23],args[24],args[25],args[26],args[27],args[28]);
    }

    public BuildingUpgrade(String GameId, String AccountType, String WorldId, String dtEventTime,String iEventId,String vVersionId,String vUin,String iRoleId,String vRoleName,String iRoleJob,String iRoleGender,String iRoleLevel,String iRoleVipLevel,String iRoleReputationLevel,String vRoleElse1,String vRoleElse2,String iRoleExperience,String iRoleSword,String iPartyId,String vPartyName,String iPartyLevel,String iBuildingParty,String iUpgrateBulidingId,String vUpgrateBulidingName,String iBulidingLevel,String iUpgrateCostParty,String jUpgrateCostMoney,String jPartyLeftMoney,String iPartyLeftPolity,String iCostTime,String dtEventEndTime){
        this.iGameId = Long.valueOf(GameId);
        this.iAccountType = Long.valueOf(AccountType);
        this.iWorldId = Long.valueOf(WorldId);
        this.dtEventTime = Timestamp.valueOf(dtEventTime);
        this.iEventId = Long.valueOf(iEventId);
        this.vVersionId = String.valueOf(vVersionId);
        this.vUin = String.valueOf(vUin);
        this.iRoleId = Long.valueOf(iRoleId);
        this.vRoleName = String.valueOf(vRoleName);
        this.iRoleJob = Long.valueOf(iRoleJob);
        this.iRoleGender = Long.valueOf(iRoleGender);
        this.iRoleLevel = Long.valueOf(iRoleLevel);
        this.iRoleVipLevel = Long.valueOf(iRoleVipLevel);
        this.iRoleReputationLevel = Long.valueOf(iRoleReputationLevel);
        this.vRoleElse1 = String.valueOf(vRoleElse1);
        this.vRoleElse2 = String.valueOf(vRoleElse2);
        this.iRoleExperience = Long.valueOf(iRoleExperience);
        this.iRoleSword = Long.valueOf(iRoleSword);
        this.iPartyId = Long.valueOf(iPartyId);
        this.vPartyName = String.valueOf(vPartyName);
        this.iPartyLevel = Long.valueOf(iPartyLevel);
        this.iBuildingParty = Long.valueOf(iBuildingParty);
        this.iUpgrateBulidingId = Long.valueOf(iUpgrateBulidingId);
        this.vUpgrateBulidingName = String.valueOf(vUpgrateBulidingName);
        this.iBulidingLevel = Long.valueOf(iBulidingLevel);
        this.iUpgrateCostParty = Long.valueOf(iUpgrateCostParty);
        this.jUpgrateCostMoney = String.valueOf(jUpgrateCostMoney);
        this.jPartyLeftMoney = String.valueOf(jPartyLeftMoney);
        this.iPartyLeftPolity = Long.valueOf(iPartyLeftPolity);
        this.iCostTime = Long.valueOf(iCostTime);
        this.dtEventEndTime = Timestamp.valueOf(dtEventEndTime);
    }
}
