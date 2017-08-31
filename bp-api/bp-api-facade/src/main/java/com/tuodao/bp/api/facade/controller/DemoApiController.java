package com.tuodao.bp.api.facade.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.tuodao.bp.api.core.response.RespResult;
import com.tuodao.bp.api.facade.service.DemoClient;
import com.tuodao.bp.model.input.demo.DemoDbInput;
import com.tuodao.bp.model.output.member.DemoBizOutput;

/**
 * demo controller
 * 
 * @author hechuan
 *
 * @created 2017年8月30日
 *
 * @since 1.0.0
 */
@RequestMapping("/router")
@RestController
public class DemoApiController {

	/** 日志 */
	private static final Logger logger = LoggerFactory.getLogger(DemoApiController.class);
	
	@Autowired
	private DemoClient demoClient;
	
	
	/**
	 * demo detail
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */
	@RequestMapping(value = "/demoDetail", method = RequestMethod.POST)
	public RespResult<DemoBizOutput> demoDetail(DemoDbInput input) {
		
		logger.info("facade DemoDbInput = [{}] ",input);
		
		// demo entity
		DemoBizOutput demoEntity = demoClient.demoDetail(input);

		return RespResult.<DemoBizOutput>create().setContent(demoEntity);
	}

	/**
	 * demo list
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */

	@RequestMapping(value = "/demoList", method = RequestMethod.POST)
	public RespResult<List<DemoBizOutput>> getDemoList(DemoDbInput input) {

		logger.info("facade DemoDbInput = [{}] ",input);
		
		// demo list
		List<DemoBizOutput> demoList = demoClient.getDemoList(input);
		
		return RespResult.<List<DemoBizOutput>>create().setContent(demoList);
	}
	
	
	/**
	 * demo page list
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */

	@RequestMapping(value = "/demoPageList", method = RequestMethod.POST)
	public RespResult<PageInfo<DemoBizOutput>> getDemoPageList(DemoDbInput input) {

		logger.info("facade DemoDbInput = [{}] ",input);
		
		// demo page list
		PageInfo<DemoBizOutput> demoPageList = demoClient.getDemoPageList(input);

		
		return RespResult.<PageInfo<DemoBizOutput>>create().setContent(demoPageList);
	}
	
	/**
	 * save demo
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */

	@RequestMapping(value = "/saveDemo", method = RequestMethod.POST)
	public RespResult<String> saveDemo(DemoDbInput input) {

		logger.info("facade DemoDbInput = [{}] ",input);
		
		demoClient.saveDemo(input);
		
		logger.info("facade save Demo success!!");
		
		return RespResult.<String>create();
	}
	
	
	/**
	 * update demo
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */

	@RequestMapping(value = "/updateDemo", method = RequestMethod.POST)
	public RespResult<String> updateDemo(DemoDbInput input) {

		logger.info("facade DemoDbInput = [{}] ",input);
		
		demoClient.updateDemo(input);
		
		logger.info("facade update Demo success!!");
		
		return RespResult.<String>create();
	}
	
	
	/**
	 * test transactional
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */

	@RequestMapping(value = "/transDemo", method = RequestMethod.POST)
	public RespResult<String> transDemo(DemoDbInput input) {
		
		logger.info("facade DemoDbInput = [{}] ",input);

		demoClient.transDemo(input);

		logger.info("facade trans Demo success!!");
		
		return RespResult.<String>create();
	}
	
}
