package com.tuodao.bp.useraccount.service.async;

import com.tuodao.bp.useraccount.db.mapper.basic.*;
import com.tuodao.bp.useraccount.db.model.basic.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;

import static com.tuodao.bp.useraccount.constants.UserContstants.BUSSINESS_CODE_FINANCE;

/**
 * @description: 异步用户操作相关
 * @author: mif
 * @date: 2017/8/28
 * @time: 11:56
 * @copyright: 拓道金服 Copyright (c) 2017
 */
@Component
@Async
public class AsyncUserService {

    private final static Logger logger = LoggerFactory.getLogger(AsyncUserService.class);

    @Resource
    private UserInfoDetailMapper userInfoDetailMapper;

    @Resource
    private UserVipInfoMapper userVipInfoMapper;

    @Resource
    private UserBusinessMapper userBusinessMapper;

    @Resource
    private UserFinancialPlannerMapper userFinancialPlannerMapper;

    @Resource
    private UserInfoExtendMapper userInfoExtendMapper;

    @Resource
    private AccountFundsMapper accountFundsMapper;

    /**
     * 异步初始化 注册信息
     *
     * @param userInfo
     */
    public void initRegist(UserInfo userInfo) {
        logger.info("async register info ,userInfo.userId ={}", userInfo.getUserId());
        // 用户信息详情(user_info_detail）
        insertUserInfoDetail(userInfo);
        //用户VIP信息（user_vip_info）
        insertUserVipInfo(userInfo);
        //用户业务表（user_bussiness）
        insertUserBusiness(userInfo);
        //用户理财师等级信息（user_financial_planner）
        insertUserFinancialPlanner(userInfo);
        //用户信息扩展表(user_info_extend)
        insertUserInfoExtend(userInfo);
        //（账户）平台账户资金（account_funds）
        insertAccountFunds(userInfo);

    }

    private void insertAccountFunds(UserInfo userInfo) {
        AccountFunds accountFunds = new AccountFunds();
        accountFunds.setUserId(userInfo.getUserId());
        accountFunds.setGmtCreator(userInfo.getGmtCreator());
        accountFundsMapper.insertSelective(accountFunds);
    }

    private void insertUserInfoExtend(UserInfo userInfo) {
        UserInfoExtend extend = new UserInfoExtend();
        extend.setUserId(userInfo.getUserId());
        extend.setGmtCreator(userInfo.getGmtCreator());
        userInfoExtendMapper.insertSelective(extend);
    }

    private void insertUserFinancialPlanner(UserInfo userInfo) {
        UserFinancialPlanner financialPlanner = new UserFinancialPlanner();
        financialPlanner.setUserId(userInfo.getUserId());
        financialPlanner.setGmtCreator(userInfo.getGmtCreator());
        userFinancialPlannerMapper.insertSelective(financialPlanner);
    }


    private void insertUserBusiness(UserInfo userInfo) {
        UserBusiness userBusiness = new UserBusiness();
        userBusiness.setUserId(userInfo.getUserId());
        userBusiness.setBussinessCode(BUSSINESS_CODE_FINANCE);
        userBusiness.setOpenType(userInfo.getRegisterSource());
        userBusiness.setGmtCreator(userInfo.getGmtCreator());
        userBusinessMapper.insertSelective(userBusiness);
    }

    private void insertUserVipInfo(UserInfo userInfo) {
        UserVipInfo vipInfo = new UserVipInfo();
        vipInfo.setUserId(userInfo.getUserId());
        vipInfo.setStartTime(new Date());
        vipInfo.setEndTime(new Date());// TODO calculate
        vipInfo.setGmtCreator(userInfo.getGmtCreator());
        userVipInfoMapper.insertSelective(vipInfo);
    }

    private void insertUserInfoDetail(UserInfo userInfo) {
        UserInfoDetail detail = new UserInfoDetail();
        detail.setUserId(userInfo.getUserId());
        detail.setProvinceCode("");//TODO resolve registIp
        detail.setProvinceName("");
        detail.setCityCode("");
        detail.setCityName("");
        detail.setGmtCreator(userInfo.getGmtCreator());
        userInfoDetailMapper.insertSelective(detail);
    }

    /**
     * 邀请人数量加1
     *
     * @param directInviterNo   直接邀请人编码
     * @param indirectInviterNo 间接邀请人编码
     */
    public void inviterAdd(String directInviterNo, String indirectInviterNo) {
        logger.info("inviterAdd : directInviterNo ={},indirectInviterNo={}", directInviterNo, indirectInviterNo);
        //直接邀请人+1
        if (StringUtils.isEmpty(directInviterNo)) {
            UserFinancialPlanner directInviterPlanner = userFinancialPlannerMapper.selectByPrimaryKey(directInviterNo);
            directInviterPlanner.setDirectInviterCount(directInviterPlanner.getDirectInviterCount() + 1);
            userFinancialPlannerMapper.updateByPrimaryKeySelective(directInviterPlanner);
        }
        //间接邀请人+1
        if (StringUtils.isEmpty(indirectInviterNo)) {
            UserFinancialPlanner indirectInviterPlanner = userFinancialPlannerMapper.selectByPrimaryKey(indirectInviterNo);
            indirectInviterPlanner.setIndirectInviter(indirectInviterPlanner.getIndirectInviter() + 1);
            userFinancialPlannerMapper.updateByPrimaryKeySelective(indirectInviterPlanner);
        }
    }
}
