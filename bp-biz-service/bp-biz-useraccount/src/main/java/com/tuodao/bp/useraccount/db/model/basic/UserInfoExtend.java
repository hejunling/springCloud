package com.tuodao.bp.useraccount.db.model.basic;

import java.io.Serializable;
import java.util.Date;

public class UserInfoExtend implements Serializable {
    private Integer id;

    private String userId;

    private Integer vipLevel;

    private Integer maxVipLevel;

    private Integer isBigCustomer;

    private Integer financialPlannerLevel;

    private Integer vipWithdrawTimes;

    private Integer exchangeWithdrawTimes;

    private Integer withdrawTimes;

    private Integer checkInDays;

    private Date gmtCreate;

    private Date gmtModify;

    private String gmtCreator;

    private String gmtModifier;

    private Integer isDel;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Integer vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Integer getMaxVipLevel() {
        return maxVipLevel;
    }

    public void setMaxVipLevel(Integer maxVipLevel) {
        this.maxVipLevel = maxVipLevel;
    }

    public Integer getIsBigCustomer() {
        return isBigCustomer;
    }

    public void setIsBigCustomer(Integer isBigCustomer) {
        this.isBigCustomer = isBigCustomer;
    }

    public Integer getFinancialPlannerLevel() {
        return financialPlannerLevel;
    }

    public void setFinancialPlannerLevel(Integer financialPlannerLevel) {
        this.financialPlannerLevel = financialPlannerLevel;
    }

    public Integer getVipWithdrawTimes() {
        return vipWithdrawTimes;
    }

    public void setVipWithdrawTimes(Integer vipWithdrawTimes) {
        this.vipWithdrawTimes = vipWithdrawTimes;
    }

    public Integer getExchangeWithdrawTimes() {
        return exchangeWithdrawTimes;
    }

    public void setExchangeWithdrawTimes(Integer exchangeWithdrawTimes) {
        this.exchangeWithdrawTimes = exchangeWithdrawTimes;
    }

    public Integer getWithdrawTimes() {
        return withdrawTimes;
    }

    public void setWithdrawTimes(Integer withdrawTimes) {
        this.withdrawTimes = withdrawTimes;
    }

    public Integer getCheckInDays() {
        return checkInDays;
    }

    public void setCheckInDays(Integer checkInDays) {
        this.checkInDays = checkInDays;
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