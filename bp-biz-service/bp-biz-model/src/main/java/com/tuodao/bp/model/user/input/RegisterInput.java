package com.tuodao.bp.model.user.input;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @description: 注册请求类
 * @author: mif
 * @date: 2017/8/28
 * @time: 10:37
 * @copyright: 拓道金服 Copyright (c) 2017
 */
public class RegisterInput implements Serializable {
    private static final long serialVersionUID = 3578961609778304301L;

    /**
     * 用户名
     */
    @NotBlank
    private String userName;

    /**
     * 手机号码
     */
    @NotBlank
    private String mobile;

    /**
     * 登录密码
     */
    @NotBlank
    private String loginPassword;

    /**
     * 密码安级别（1：弱；2：强；3：最高）
     */
    @NotNull
    private Integer pwSecurityLevel;

    /**
     * 支付密码
     */
    @NotBlank
    private String payPassword;

    /**
     * 用户头像URL
     */
    @NotBlank
    private String avatarUrl;

    /**
     * 邀请人号码
     */

    private String inviterMobile;

    /**
     * 用户类型（1：投资用户：2：融资用户；）
     */
    private Integer userType;

    /**
     * 投资用户类型(1：普通用户；2：内部用户)
     */
    private Integer investUserType;

    /**
     * 注册来源（0：后台；1：WEB；2：IOS；3：ANDROID；4：H5）
     */
    @NotNull
    private Integer registerSource;

    /**
     * 注册IP
     */
    private String registerIp;

    /**
     * 注册版本
     */
    private String registerVersion;

    /**
     * 来源渠道（好友邀请、VIVO、360等等）
     */
    private String sourceChannel;

    /**
     * 添加人
     */
    private String gmtCreator;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
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
        this.payPassword = payPassword;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getInviterMobile() {
        return inviterMobile;
    }

    public void setInviterMobile(String inviterMobile) {
        this.inviterMobile = inviterMobile;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getInvestUserType() {
        return investUserType;
    }

    public void setInvestUserType(Integer investUserType) {
        this.investUserType = investUserType;
    }

    public Integer getRegisterSource() {
        return registerSource;
    }

    public void setRegisterSource(Integer registerSource) {
        this.registerSource = registerSource;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public String getRegisterVersion() {
        return registerVersion;
    }

    public void setRegisterVersion(String registerVersion) {
        this.registerVersion = registerVersion;
    }

    public String getSourceChannel() {
        return sourceChannel;
    }

    public void setSourceChannel(String sourceChannel) {
        this.sourceChannel = sourceChannel;
    }

    public String getGmtCreator() {
        return gmtCreator;
    }

    public void setGmtCreator(String gmtCreator) {
        this.gmtCreator = gmtCreator;
    }

    @Override
    public String toString() {
        return "RegisterInput{" +
                "userName='" + userName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", pwSecurityLevel=" + pwSecurityLevel +
                ", payPassword='" + payPassword + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", inviterMobile='" + inviterMobile + '\'' +
                ", userType=" + userType +
                ", investUserType=" + investUserType +
                ", registerSource=" + registerSource +
                ", registerIp='" + registerIp + '\'' +
                ", registerVersion='" + registerVersion + '\'' +
                ", sourceChannel='" + sourceChannel + '\'' +
                ", gmtCreator='" + gmtCreator + '\'' +
                '}';
    }
}
