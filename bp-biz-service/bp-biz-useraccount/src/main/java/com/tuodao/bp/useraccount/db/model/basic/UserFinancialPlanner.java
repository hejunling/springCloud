package com.tuodao.bp.useraccount.db.model.basic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UserFinancialPlanner implements Serializable {
    private String userId;

    private String moblie;

    private Integer financialPlannerLevel;

    private Integer inviterCount;

    private Integer directInviterCount;

    private Integer indirectInviter;

    private Integer vip1Count;

    private BigDecimal duiInFundCount;

    private Integer validTime;

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

    public Integer getFinancialPlannerLevel() {
        return financialPlannerLevel;
    }

    public void setFinancialPlannerLevel(Integer financialPlannerLevel) {
        this.financialPlannerLevel = financialPlannerLevel;
    }

    public Integer getInviterCount() {
        return inviterCount;
    }

    public void setInviterCount(Integer inviterCount) {
        this.inviterCount = inviterCount;
    }

    public Integer getDirectInviterCount() {
        return directInviterCount;
    }

    public void setDirectInviterCount(Integer directInviterCount) {
        this.directInviterCount = directInviterCount;
    }

    public Integer getIndirectInviter() {
        return indirectInviter;
    }

    public void setIndirectInviter(Integer indirectInviter) {
        this.indirectInviter = indirectInviter;
    }

    public Integer getVip1Count() {
        return vip1Count;
    }

    public void setVip1Count(Integer vip1Count) {
        this.vip1Count = vip1Count;
    }

    public BigDecimal getDuiInFundCount() {
        return duiInFundCount;
    }

    public void setDuiInFundCount(BigDecimal duiInFundCount) {
        this.duiInFundCount = duiInFundCount;
    }

    public Integer getValidTime() {
        return validTime;
    }

    public void setValidTime(Integer validTime) {
        this.validTime = validTime;
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