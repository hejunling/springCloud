package com.tuodao.bp.useraccount.db.model.basic;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    private String userId;

    private String userName;

    private String mobile;

    private String loginPassword;

    private Integer pwSecurityLevel;

    private String payPassword;

    private String avatarUrl;

    private String directInviterNo;

    private String indirectInviterNo;

    private Integer userStatus;

    private Integer userType;

    private Integer investFlag;

    private Integer investUserType;

    private Integer isNewbie;

    private Integer isOpenDeposit;

    private Integer isBindBank;

    private Integer registSource;

    private String registIp;

    private String registVersion;

    private String sourceChannel;

    private String invitCode;

    private Date gmtCreate;

    private Date gmtModify;

    private String gmtCreator;

    private String gmtModifier;

    private Integer isDel;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public Integer getPwSecurityLevel() {
        return pwSecurityLevel;
    }

    public void setPwSecurityLevel(Integer pwSecurityLevel) {
        this.pwSecurityLevel = pwSecurityLevel;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getDirectInviterNo() {
        return directInviterNo;
    }

    public void setDirectInviterNo(String directInviterNo) {
        this.directInviterNo = directInviterNo == null ? null : directInviterNo.trim();
    }

    public String getIndirectInviterNo() {
        return indirectInviterNo;
    }

    public void setIndirectInviterNo(String indirectInviterNo) {
        this.indirectInviterNo = indirectInviterNo == null ? null : indirectInviterNo.trim();
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getInvestFlag() {
        return investFlag;
    }

    public void setInvestFlag(Integer investFlag) {
        this.investFlag = investFlag;
    }

    public Integer getInvestUserType() {
        return investUserType;
    }

    public void setInvestUserType(Integer investUserType) {
        this.investUserType = investUserType;
    }

    public Integer getIsNewbie() {
        return isNewbie;
    }

    public void setIsNewbie(Integer isNewbie) {
        this.isNewbie = isNewbie;
    }

    public Integer getIsOpenDeposit() {
        return isOpenDeposit;
    }

    public void setIsOpenDeposit(Integer isOpenDeposit) {
        this.isOpenDeposit = isOpenDeposit;
    }

    public Integer getIsBindBank() {
        return isBindBank;
    }

    public void setIsBindBank(Integer isBindBank) {
        this.isBindBank = isBindBank;
    }

    public Integer getRegistSource() {
        return registSource;
    }

    public void setRegistSource(Integer registSource) {
        this.registSource = registSource;
    }

    public String getRegistIp() {
        return registIp;
    }

    public void setRegistIp(String registIp) {
        this.registIp = registIp == null ? null : registIp.trim();
    }

    public String getRegistVersion() {
        return registVersion;
    }

    public void setRegistVersion(String registVersion) {
        this.registVersion = registVersion == null ? null : registVersion.trim();
    }

    public String getSourceChannel() {
        return sourceChannel;
    }

    public void setSourceChannel(String sourceChannel) {
        this.sourceChannel = sourceChannel == null ? null : sourceChannel.trim();
    }

    public String getInvitCode() {
        return invitCode;
    }

    public void setInvitCode(String invitCode) {
        this.invitCode = invitCode == null ? null : invitCode.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public String getGmtCreator() {
        return gmtCreator;
    }

    public void setGmtCreator(String gmtCreator) {
        this.gmtCreator = gmtCreator == null ? null : gmtCreator.trim();
    }

    public String getGmtModifier() {
        return gmtModifier;
    }

    public void setGmtModifier(String gmtModifier) {
        this.gmtModifier = gmtModifier == null ? null : gmtModifier.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}