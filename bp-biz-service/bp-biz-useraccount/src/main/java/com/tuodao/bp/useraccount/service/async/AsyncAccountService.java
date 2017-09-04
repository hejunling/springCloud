package com.tuodao.bp.useraccount.service.async;

import com.tuodao.bp.model.user.input.OpenDepositInput;
import com.tuodao.bp.useraccount.db.mapper.basic.AccountFinanceMapper;
import com.tuodao.bp.useraccount.db.mapper.basic.UserInfoDetailMapper;
import com.tuodao.bp.useraccount.db.mapper.basic.UserInfoMapper;
import com.tuodao.bp.useraccount.db.model.basic.AccountFinance;
import com.tuodao.bp.useraccount.db.model.basic.UserInfo;
import com.tuodao.bp.useraccount.db.model.basic.UserInfoDetail;
import com.tuodao.bp.useraccount.utils.IdCardUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import static com.tuodao.bp.useraccount.constants.UserContstants.IF_YES;

/**
 * @description: 账户异步服务
 * @author: mif
 * @date: 2017/8/28
 * @time: 16:38
 * @copyright: 拓道金服 Copyright (c) 2017
 */
@Component
@Async
public class AsyncAccountService {

    private final static Logger logger = LoggerFactory.getLogger(AsyncAccountService.class);

    @Resource
    private UserInfoMapper userInfoMapper;

    @Resource
    private AccountFinanceMapper accountFinanceMapper;

    @Resource
    private UserInfoDetailMapper userInfoDetailMapper;

    public void openDeposit(OpenDepositInput openDepositInput) {
        logger.info("async open deposit,openDepositInput={}", openDepositInput);
        //update 用户信息（bp_user_info）
        updateUserInfo(openDepositInput.getUserId(), openDepositInput.getGmtCreator());

        //insert（账户）金融资金账户（account_finance）
        insertAccountFinace(openDepositInput);

        //update 用户信息详情(user_info_detail）
        updateUserInfoDetail(openDepositInput);
    }

    /**
     * 更新用户信息
     *
     * @param openDepositInput
     */
    private void updateUserInfoDetail(OpenDepositInput openDepositInput) {
        String idCard = openDepositInput.getIdCard();
        UserInfoDetail detail = new UserInfoDetail();
        detail.setUserId(openDepositInput.getUserId());
        detail.setSex(IdCardUtils.getSex(idCard));
        detail.setBirthday(IdCardUtils.getBirthday(idCard));//
        detail.setConstellation(IdCardUtils.getConstellation(idCard));
        detail.setGmtModifier(openDepositInput.getGmtCreator());

        userInfoDetailMapper.updateByPrimaryKeySelective(detail);
    }


    /**
     * 插入金融资金账户信息
     *
     * @param openDepositInput
     */
    private void insertAccountFinace(OpenDepositInput openDepositInput) {
        AccountFinance accountFinance = new AccountFinance();
        accountFinance.setUserId(openDepositInput.getUserId());
        accountFinance.setDepositNo(openDepositInput.getDepositNo());
        accountFinance.setGmtCreator(openDepositInput.getGmtCreator());
        accountFinanceMapper.insertSelective(accountFinance);
    }

    /**
     * 修改用户是否开通存管
     *
     * @param userId     用户编号
     * @param gmtCreator 创建人
     */
    private void updateUserInfo(String userId, String gmtCreator) {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        userInfo.setIsOpenDeposit(IF_YES);
        userInfo.setGmtModifier(gmtCreator);
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }
}
