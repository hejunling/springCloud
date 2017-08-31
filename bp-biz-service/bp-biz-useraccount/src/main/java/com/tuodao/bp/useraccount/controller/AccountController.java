package com.tuodao.bp.useraccount.controller;

import com.tuodao.bp.model.user.input.InvestmentInput;
import com.tuodao.bp.model.user.input.OpenDepositInput;
import com.tuodao.bp.model.user.input.RechargeInput;
import com.tuodao.bp.model.user.input.WithdrawInput;
import com.tuodao.bp.useraccount.service.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: 账户相关控制类
 * @author: mif
 * @date: 2017/8/28
 * @time: 15:41
 * @copyright: 拓道金服 Copyright (c) 2017
 */
@RestController
@RequestMapping(value = "user/account")
public class AccountController {

    private final static Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Resource
    private IAccountService accountService;

    /**
     * 开通存管
     *
     * @param input 请求类型
     */
    @RequestMapping(value = "openDeposit", method = RequestMethod.POST)
    public void openDeposit(OpenDepositInput input) {
        accountService.openDeposit(input);
    }

    /**
     * 充值
     *
     * @param rechargeInput 充值请求内容
     */
    @RequestMapping(value = "recharge", method = RequestMethod.POST)
    public void recharge(RechargeInput rechargeInput) {
        accountService.recharge(rechargeInput);
    }

    /**
     * 提现
     *
     * @param withdrawInput 提现请求内容
     */
    @RequestMapping(value = "withdraw", method = RequestMethod.POST)
    public void withdraw(WithdrawInput withdrawInput) {
        accountService.withdraw(withdrawInput);
    }

    /**
     * 投资
     *
     * @param investmentInput 投资请求内容
     */
    @RequestMapping(value = "investment", method = RequestMethod.POST)
    public void investment(InvestmentInput investmentInput) {
        accountService.investment(investmentInput);
    }
}
