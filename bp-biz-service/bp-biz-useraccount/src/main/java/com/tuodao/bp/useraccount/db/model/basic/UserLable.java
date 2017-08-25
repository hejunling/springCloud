package com.tuodao.bp.useraccount.db.model.basic;

import java.io.Serializable;
import java.util.Date;

public class UserLable implements Serializable {
    private Integer id;

    private String userId;

    private String moblie;

    private String userLable;

    private Integer lableType;

    private String renark;

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

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie == null ? null : moblie.trim();
    }

    public String getUserLable() {
        return userLable;
    }

    public void setUserLable(String userLable) {
        this.userLable = userLable == null ? null : userLable.trim();
    }

    public Integer getLableType() {
        return lableType;
    }

    public void setLableType(Integer lableType) {
        this.lableType = lableType;
    }

    public String getRenark() {
        return renark;
    }

    public void setRenark(String renark) {
        this.renark = renark == null ? null : renark.trim();
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