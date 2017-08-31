package com.tuodao.bp.model.user.input;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description: 用户充值请求封装
 * @author: mif
 * @date: 2017/8/28
 * @time: 17:45
 * @copyright: 拓道金服 Copyright (c) 2017
 */
public class RechargeInput extends UserBaseInput implements Serializable {
    private static final long serialVersionUID = 7821579487059696763L;

    /**
     * 充值金额(分)
     */
    private BigDecimal funds;

    public BigDecimal getFunds() {
        return funds;
    }

    public void setFunds(BigDecimal funds) {
        this.funds = funds;
    }
}
