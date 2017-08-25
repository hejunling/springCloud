package com.tuodao.bp.useraccount.db.model.basic;

import java.io.Serializable;
import java.util.Date;

public class AccountIncomeDetail implements Serializable {
    private Long id;

    private String userId;

    private String moblie;

    private String incomeType;

    private Double incomeMoney;

    private String remark;

    private Date gmtCreate;

    private Date gmtModify;

    private String gmtCreator;

    private String gmtModifier;

    private Integer isDel;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType == null ? null : incomeType.trim();
    }

    public Double getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(Double incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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