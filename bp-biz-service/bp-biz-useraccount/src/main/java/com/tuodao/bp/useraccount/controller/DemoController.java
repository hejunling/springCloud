package com.tuodao.bp.useraccount.controller;

import javax.jms.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tuodao.bp.model.input.demo.DemoInput;
import com.tuodao.bp.model.output.member.DemoOuput;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@Autowired
	private JmsMessagingTemplate jmsTemplate;
	
	@Autowired
	private Queue user2operation;
	
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
}
