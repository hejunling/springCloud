package com.tuodao.bp.model.user.input;

import java.io.Serializable;

/**
 * @description: 用户基础请求参数
 * @author: mif
 * @date: 2017/8/28
 * @time: 16:06
 * @copyright: 拓道金服 Copyright (c) 2017
 */
public class UserBaseInput implements Serializable {
    private static final long serialVersionUID = 966860760403799757L;

    /**
     * 用户编码
     */
    private String userId;

    /**
     * 操作人
     */
    private String operator;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
