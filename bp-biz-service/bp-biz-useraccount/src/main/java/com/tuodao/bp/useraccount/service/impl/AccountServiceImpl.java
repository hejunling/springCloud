package com.tuodao.bp.useraccount.service.impl;

import com.tuodao.bp.model.user.input.InvestmentInput;
import com.tuodao.bp.model.user.input.OpenDepositInput;
import com.tuodao.bp.model.user.input.RechargeInput;
import com.tuodao.bp.model.user.input.WithdrawInput;
import com.tuodao.bp.useraccount.db.mapper.basic.AccountFinanceMapper;
import com.tuodao.bp.useraccount.db.mapper.basic.AccountFundsMapper;
import com.tuodao.bp.useraccount.db.mapper.basic.UserDepositInfoMapper;
import com.tuodao.bp.useraccount.db.model.basic.AccountFinance;
import com.tuodao.bp.useraccount.db.model.basic.AccountFunds;
import com.tuodao.bp.useraccount.db.model.basic.UserDepositInfo;
import com.tuodao.bp.useraccount.service.IAccountService;
import com.tuodao.bp.useraccount.service.UserBaseService;
import com.tuodao.bp.useraccount.service.async.AsyncAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @description: 账户相关服务
 * @author: mif
 * @date: 2017/8/28
 * @time: 16:29
 * @copyright: 拓道金服 Copyright (c) 2017
 */
@Service
public class AccountServiceImpl extends UserBaseService implements IAccountService {

    private final static Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private AsyncAccountService asyncAccountService;

    @Resource
    private UserDepositInfoMapper userDepositInfoMapper;

    @Resource
    private AccountFinanceMapper accountFinanceMapper;

    @Resource
    private AccountFundsMapper accountFundsMapper;

    @Override
    public void openDeposit(OpenDepositInput input) {
        logger.info("user open deposit,openDepositInput ={}", input);

        UserDepositInfo depositInfo = new UserDepositInfo();
        //TODO copy
        userDepositInfoMapper.insertSelective(depositInfo);
        //异步数据
        asyncAccountService.openDeposit(input);
    }

    @Override
    public void recharge(RechargeInput rechargeInput) {
        String userId = rechargeInput.getUserId();
        BigDecimal funds = rechargeInput.getFunds();
        //update（账户）金融资金账户（account_finance）
        AccountFinance finance = accountFinanceMapper.selectByPrimaryKey(userId);
        finance.setUserId(finance.getUserId());
        finance.setTotalFund(finance.getTotalFund().add(funds)); //存管账户总资金（分）
        finance.setCanWithdrawFund(finance.getCanWithdrawFund().add(funds)); //可提现金额（分）
        finance.setTotalRecharge(finance.getTotalRecharge().add(funds));//累计充值（分）
        finance.setGmtModifier(rechargeInput.getOperator());
        accountFinanceMapper.updateByPrimaryKeySelective(finance);

        //update  （账户）平台账户资金（account_funds）
        AccountFunds accountFunds = accountFundsMapper.selectByPrimaryKey(userId);
        accountFunds.setUserId(userId);
        accountFunds.setTotalFund(accountFunds.getTotalFund().add(funds));       //平台总资金(分)
        accountFunds.setFinanceFund(accountFunds.getFinanceFund().add(funds));   //  金融总资金（分）
        accountFunds.setGmtModifier(rechargeInput.getOperator());
        accountFundsMapper.updateByPrimaryKeySelective(accountFunds);
    }

    @Override
    public void withdraw(WithdrawInput withdrawInput) {
        String userId = withdrawInput.getUserId();
        BigDecimal funds = withdrawInput.getFunds();

        //update（账户）金融资金账户（account_finance）
        AccountFinance finance = accountFinanceMapper.selectByPrimaryKey(userId);
        finance.setUserId(finance.getUserId());
        finance.setTotalFund(finance.getTotalFund().subtract(funds));  //存管账户总资金（分）
        finance.setUsableFund(finance.getUsableFund().subtract(funds));  //可用余额(分)
        finance.setCanWithdrawFund(finance.getCanWithdrawFund().subtract(funds)); //可提现金额（分）
        finance.setTotalWithdraw(finance.getTotalWithdraw().add(funds)); //累计提现（分）
        finance.setGmtModifier(withdrawInput.getOperator());
        accountFinanceMapper.updateByPrimaryKeySelective(finance);

        //update  （账户）平台账户资金（account_funds）
        AccountFunds accountFunds = accountFundsMapper.selectByPrimaryKey(userId);
        accountFunds.setUserId(userId);
        accountFunds.setTotalFund(accountFunds.getTotalFund().subtract(funds));       //平台总资金(分)
        accountFunds.setFinanceFund(accountFunds.getFinanceFund().subtract(funds));   //  金融总资金（分）
        accountFunds.setGmtModifier(withdrawInput.getOperator());
        accountFundsMapper.updateByPrimaryKeySelective(accountFunds);
    }

    @Override
    public void investment(InvestmentInput investmentInput) {
        String userId = investmentInput.getUserId();
        BigDecimal funds = investmentInput.getFunds();

        //update（账户）金融资金账户（account_finance）TODO
        AccountFinance finance = accountFinanceMapper.selectByPrimaryKey(userId);
    }
}
