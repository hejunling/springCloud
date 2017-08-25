package com.tuodao.bp.useraccount.db.model.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AccountFinance implements Serializable {
    private String userId;

    private String moblie;

    private String depositNo;

    private BigDecimal totalFund;

    private BigDecimal totalEarnings;

    private BigDecimal duiInFund;

    private BigDecimal usableFund;

    private BigDecimal dueInPrincipal;

    private BigDecimal dueInInterest;

    private BigDecimal freezeFund;

    private BigDecimal canWithdrawFund;

    private BigDecimal totalRecharge;

    private BigDecimal totalWithdraw;

    private Integer investmentTimes;

    private BigDecimal investmentAmount;

    private BigDecimal returnAmount;

    private BigDecimal couponsAmount;

    private Integer usableScores;

    private Integer usableCoupons;

    private Integer usableInterest;

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

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie == null ? null : moblie.trim();
    }

    public String getDepositNo() {
        return depositNo;
    }

    public void setDepositNo(String depositNo) {
        this.depositNo = depositNo == null ? null : depositNo.trim();
    }

    public BigDecimal getTotalFund() {
        return totalFund;
    }

    public void setTotalFund(BigDecimal totalFund) {
        this.totalFund = totalFund;
    }

    public BigDecimal getTotalEarnings() {
        return totalEarnings;
    }

    public void setTotalEarnings(BigDecimal totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    public BigDecimal getDuiInFund() {
        return duiInFund;
    }

    public void setDuiInFund(BigDecimal duiInFund) {
        this.duiInFund = duiInFund;
    }

    public BigDecimal getUsableFund() {
        return usableFund;
    }

    public void setUsableFund(BigDecimal usableFund) {
        this.usableFund = usableFund;
    }

    public BigDecimal getDueInPrincipal() {
        return dueInPrincipal;
    }

    public void setDueInPrincipal(BigDecimal dueInPrincipal) {
        this.dueInPrincipal = dueInPrincipal;
    }

    public BigDecimal getDueInInterest() {
        return dueInInterest;
    }

    public void setDueInInterest(BigDecimal dueInInterest) {
        this.dueInInterest = dueInInterest;
    }

    public BigDecimal getFreezeFund() {
        return freezeFund;
    }

    public void setFreezeFund(BigDecimal freezeFund) {
        this.freezeFund = freezeFund;
    }

    public BigDecimal getCanWithdrawFund() {
        return canWithdrawFund;
    }

    public void setCanWithdrawFund(BigDecimal canWithdrawFund) {
        this.canWithdrawFund = canWithdrawFund;
    }

    public BigDecimal getTotalRecharge() {
        return totalRecharge;
    }

    public void setTotalRecharge(BigDecimal totalRecharge) {
        this.totalRecharge = totalRecharge;
    }

    public BigDecimal getTotalWithdraw() {
        return totalWithdraw;
    }

    public void setTotalWithdraw(BigDecimal totalWithdraw) {
        this.totalWithdraw = totalWithdraw;
    }

    public Integer getInvestmentTimes() {
        return investmentTimes;
    }

    public void setInvestmentTimes(Integer investmentTimes) {
        this.investmentTimes = investmentTimes;
    }

    public BigDecimal getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(BigDecimal investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    public BigDecimal getCouponsAmount() {
        return couponsAmount;
    }

    public void setCouponsAmount(BigDecimal couponsAmount) {
        this.couponsAmount = couponsAmount;
    }

    public Integer getUsableScores() {
        return usableScores;
    }

    public void setUsableScores(Integer usableScores) {
        this.usableScores = usableScores;
    }

    public Integer getUsableCoupons() {
        return usableCoupons;
    }

    public void setUsableCoupons(Integer usableCoupons) {
        this.usableCoupons = usableCoupons;
    }

    public Integer getUsableInterest() {
        return usableInterest;
    }

    public void setUsableInterest(Integer usableInterest) {
        this.usableInterest = usableInterest;
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