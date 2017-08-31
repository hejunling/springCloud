package com.tuodao.bp.model.user.input;

import java.io.Serializable;

/**
 * @description: 存管开通请求类
 * @author: mif
 * @date: 2017/8/28
 * @time: 15:57
 * @copyright: 拓道金服 Copyright (c) 2017
 */
public class OpenDepositInput extends UserBaseInput implements Serializable {

    private static final long serialVersionUID = -7374026360076396604L;

    /**
     * 用户号码
     */
    private String moblie;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号码
     */
    private String idCard;

    /**
     * 银行编码
     */
    private String bankCode;

    /**
     * 银行卡号
     */
    private String bankNum;

    /**
     * 预留手机号码
     */
    private String reservationMobile;

    /**
     * 存管编号
     */
    private String depositNo;

    /**
     * 添加人
     */
    private String gmtCreator;

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    public String getReservationMobile() {
        return reservationMobile;
    }

    public void setReservationMobile(String reservationMobile) {
        this.reservationMobile = reservationMobile;
    }

    public String getDepositNo() {
        return depositNo;
    }

    public void setDepositNo(String depositNo) {
        this.depositNo = depositNo;
    }

    public String getGmtCreator() {
        return gmtCreator;
    }

    public void setGmtCreator(String gmtCreator) {
        this.gmtCreator = gmtCreator;
    }

    @Override
    public String toString() {
        return "OpenDepositInput{" +
                "moblie='" + moblie + '\'' +
                ", realName='" + realName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", bankNum='" + bankNum + '\'' +
                ", reservationMobile='" + reservationMobile + '\'' +
                ", depositNo='" + depositNo + '\'' +
                ", gmtCreator='" + gmtCreator + '\'' +
                '}';
    }
}
