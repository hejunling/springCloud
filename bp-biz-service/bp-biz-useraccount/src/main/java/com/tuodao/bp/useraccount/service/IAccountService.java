package com.tuodao.bp.useraccount.service;

import com.tuodao.bp.model.user.input.InvestmentInput;
import com.tuodao.bp.model.user.input.OpenDepositInput;
import com.tuodao.bp.model.user.input.RechargeInput;
import com.tuodao.bp.model.user.input.WithdrawInput;

/**
 * @description: 账户相关服务接口
 * @author: mif
 * @date: 2017/8/28
 * @time: 16:28
 * @copyright: 拓道金服 Copyright (c) 2017
 */
public interface IAccountService {

    /**
     * 开通存管
     *
     * @param input
     */
    void openDeposit(OpenDepositInput input);

    /**
     * 用户充值
     *
     * @param rechargeInput
     */
    void recharge(RechargeInput rechargeInput);

    /**
     * 提现
     *
     * @param withdrawInput
     */
    void withdraw(WithdrawInput withdrawInput);

    /**
     * 投资
     *
     * @param investmentInput
     */
    void investment(InvestmentInput investmentInput);
}
