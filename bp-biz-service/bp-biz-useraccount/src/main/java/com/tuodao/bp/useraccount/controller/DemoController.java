package com.tuodao.bp.useraccount.controller;

import java.util.List;

import javax.jms.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.tuodao.bp.model.input.demo.DemoDbInput;
import com.tuodao.bp.model.input.demo.DemoInput;
import com.tuodao.bp.model.input.demo.ParamInput;
import com.tuodao.bp.model.output.member.DemoBizOutput;
import com.tuodao.bp.model.output.member.DemoOuput;
import com.tuodao.bp.useraccount.db.model.basic.Demo;
import com.tuodao.bp.useraccount.service.IDemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@Autowired
	private JmsMessagingTemplate jmsTemplate;
	
	@Autowired
	private Queue user2operation;
	
	@Autowired
	private IDemoService demoService;
	
	@Value("${server.port}")
	private String port;
	
	@RequestMapping(value="/getDemo",method=RequestMethod.POST)
	public DemoOuput getDemo(@RequestParam(value="name") String name) {
		logger.info("name = {}",name);
		
		DemoOuput out = new DemoOuput();
		out.setOutName("fastJSON");
		out.setOutAddress("China-port:"+port);
		
		logger.info("out = {}", out);
		return out;
	}
	
	@RequestMapping(value="/entity",method=RequestMethod.POST)
	@ResponseBody
	public DemoOuput getEntity(@RequestBody DemoInput demoInput) {
		logger.info("input = {}",demoInput);
		
		DemoOuput out = new DemoOuput();
		out.setOutName("entity-"+demoInput.getName());
		out.setOutAddress("entity-"+demoInput.getAddress()+"-port:"+port);
		
		logger.info("out = {}", out);
		return out;
	}
	
	@RequestMapping(value="/mq",method=RequestMethod.POST)
	@ResponseBody
	public DemoOuput process(@RequestParam String address) {
		logger.info("address = {}",address);
		
		DemoOuput out = new DemoOuput();
		out.setOutName("mq-name");
		out.setOutAddress("mq-"+address+"-port:"+port);
		
		logger.info("out = {}", out);
		
		jmsTemplate.convertAndSend(user2operation, out);
		
		return out;
	}
	
	@RequestMapping(value="/validate",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public DemoOuput validate(@RequestBody ParamInput input) {
		logger.info("input = {}",input);
		
		DemoOuput out = new DemoOuput();
		out.setOutName("chengdu");
		out.setOutAddress("china-port:"+port);
		
		logger.info("out = {}", out);
		
		return out;
	}
	
	
	/**
	 * demo detail
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */
	@RequestMapping(value = "/demoDetail", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public DemoBizOutput demoDetail(DemoDbInput input) {
		
		logger.info("DemoDbInput = [{}] ",input);
		
		// demo entity
		DemoBizOutput demoEntity = demoService.getDemoEntity(input);

		return demoEntity;
	}

	/**
	 * demo list
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */

	@RequestMapping(value = "/demoList", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<DemoBizOutput> getDemoList(DemoDbInput input) {

		logger.info("DemoDbInput = [{}] ",input);
		
		// demo list
		List<DemoBizOutput> demoList = demoService.getDemoList(input);
		
		return demoList;
	}
	
	
	/**
	 * demo page list
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */

	@RequestMapping(value = "/demoPageList", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public PageInfo<DemoBizOutput> getDemoPageList(DemoDbInput input) {

		logger.info("DemoDbInput = [{}] ",input);
		
		// demo page list
		PageInfo<DemoBizOutput> demoPageList = demoService.getDemoPageList(input);

		
		return demoPageList;
	}
	
	/**
	 * save demo
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */

	@RequestMapping(value = "/saveDemo", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public void saveDemo(DemoDbInput input) {

		logger.info("DemoDbInput = [{}] ",input);
		
		demoService.saveDemo(input);
		
		logger.info("save Demo success!!");

	}
	
	
	/**
	 * update demo
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */

	@RequestMapping(value = "/updateDemo", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public void updateDemo(DemoDbInput input) {

		logger.info("DemoDbInput = [{}] ",input);
		
		demoService.updateDemo(input);
		
		logger.info("update Demo success!!");

	}
	
	
	/**
	 * test transactional
	 * 
	 * @param input
	 *            输入参数
	 * @return
	 */

	@RequestMapping(value = "/transDemo", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public void transDemo(DemoDbInput input) {
		
		logger.info("DemoDbInput = [{}] ",input);

		demoService.testTransactional(input);

		logger.info("trans Demo success!!");
	}
	
}
