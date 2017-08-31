package com.tuodao.bp.useraccount.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.tuodao.bp.model.input.demo.DemoDbInput;
import com.tuodao.bp.model.output.member.DemoBizOutput;
import com.tuodao.bp.result.exception.MicroServiceException;
import com.tuodao.bp.useraccount.constant.UserAccountExceptionConstant;
import com.tuodao.bp.useraccount.db.mapper.basic.DemoMapper;
import com.tuodao.bp.useraccount.db.model.basic.Demo;
import com.tuodao.bp.useraccount.db.model.basic.DemoExample;
import com.tuodao.bp.useraccount.db.model.basic.DemoExample.Criteria;
import com.tuodao.bp.useraccount.service.IDemoService;

/**
 * demo service 实现
 * 
 * @author hechuan
 *
 * @created 2017年8月30日
 *
 * @since 1.0.0
 */
@Transactional	
@Service
public class DemoServiceImpl implements IDemoService {

	/** 日志 */
	private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

	@Autowired
	private DemoMapper demoMapper;

	/**
	 * {@link IDemoService#getDemoList(DemoDbInput)}
	 */
	@Override
	public List<DemoBizOutput> getDemoList(DemoDbInput input) {
		DemoExample example = new DemoExample();
		Criteria cc = example.createCriteria();

		// 电话号码
		String phone = input.getPhone();

		logger.debug("phone =[{}]", phone);
		cc.andPhoneLike("%" + phone + "%");

		List<Demo> demoList = demoMapper.selectByExample(example);
		return FluentIterable.<Demo>from(demoList).transform(new Function<Demo,DemoBizOutput>(){
			@Override
			public DemoBizOutput apply(Demo input) {
				DemoBizOutput out = new DemoBizOutput();
				BeanUtils.copyProperties(input, out);
				return out;
			}
		}).toList();

	}

	/**
	 * {@link IDemoService#getDemoList(DemoDbInput)}
	 */
	@Override
	public DemoBizOutput getDemoEntity(DemoDbInput input) {
		DemoExample example = new DemoExample();
		Criteria cc = example.createCriteria();

		// 电话号码
		String phone = input.getPhone();

		logger.debug("phone =[{}]", phone);
		cc.andPhoneEqualTo(phone);

		List<Demo> demoList = demoMapper.selectByExample(example);

		if (demoList.size() > 1) {
			logger.error("demoList.size = [{}]", demoList.size());
			throw new MicroServiceException(UserAccountExceptionConstant.USER_ACCOUNT_RECORD_NOT_ONLY);
		}
		Demo demo = demoList.get(0);
		// 类型转换
		DemoBizOutput out = new DemoBizOutput();
		BeanUtils.copyProperties(demo, out);
		return out;
	}

	/**
	 * {@link IDemoService#getDemoPageList(DemoDbInput)}
	 */
	@Override
	public PageInfo<DemoBizOutput> getDemoPageList(DemoDbInput input) {
		DemoExample example = new DemoExample();
		Criteria cc = example.createCriteria();
		// 电话号码
		String phone = input.getPhone();

		logger.debug("phone =[{}]", phone);
		cc.andPhoneLike("%" + phone + "%");
		
		PageHelper.startPage(input.getCurrentPage(), input.getPageSize());
		List<Demo> demoList = demoMapper.selectByExample(example);
		
		ImmutableList<DemoBizOutput> resultList = FluentIterable.<Demo>from(demoList).transform(new Function<Demo,DemoBizOutput>(){
			@Override
			public DemoBizOutput apply(Demo input) {
				DemoBizOutput out = new DemoBizOutput();
				BeanUtils.copyProperties(input, out);
				return out;
			}
		}).toList();
		
		 PageInfo<DemoBizOutput> result = new PageInfo<DemoBizOutput>(resultList);
	     Page<Demo> page = (Page<Demo>)demoList;
	     result.setTotal(page.getTotal());
		return result;
	}

	/**
	 * {@link IDemoService#saveDemo(DemoDbInput)}
	 */
	@Override
	public int saveDemo(DemoDbInput input) {
		Demo record = new Demo();
		String random = org.apache.commons.lang3.RandomStringUtils.random(5, "ABCDEFGHIJKLMN");
		record.setEmail(random + "@qq.com");
		record.setName(random);
		record.setPhone(input.getPhone());
		record.setUserName(random);
		int insertSelective = demoMapper.insertSelective(record);
		logger.debug("saveDemo Influence rows = [{}]",insertSelective);
		
		return insertSelective;
	}

	/**
	 * {@link IDemoService#updateDemo(DemoDbInput)}
	 */
	@Override
	public int updateDemo(DemoDbInput input) {
		Demo record = new Demo();
		record.setId(5);
		record.setUserName("cookie");
		int update = demoMapper.updateByPrimaryKeySelective(record);
		logger.debug("updateDemo Influence rows = [{}]",update);
		
		return update;
	}

	/**
	 * {@link IDemoService#testTransactional(DemoDbInput)}
	 */
	@Override
	public int testTransactional(DemoDbInput input) {
		Demo demo = new Demo();
		BeanUtils.copyProperties(input, demo);
		int insertSelective = demoMapper.insertSelective(demo);
		if (StringUtils.equals(input.getPhone(), "1366666")) {
			throw new MicroServiceException(UserAccountExceptionConstant.USER_ACCOUNT_TRANSACTION_EXCEPTION);
		}
		logger.debug("testTransactional Influence rows = [{}]",insertSelective);
		return insertSelective;
	}

}
