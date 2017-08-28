package com.tuodao.bp.biz.operation.mq;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.tuodao.bp.model.output.member.DemoOuput;

@Component
public class DemoQueue {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoQueue.class);

	@JmsListener(destination="useraccount.to.operation")
	public void process(DemoOuput out) {
		logger.info("demoQueue.process.out = {}",out);
		
		if(StringUtils.isBlank(out.toString())) {
			logger.info("out is blank...");
		}else {
			logger.info("out = {}",out);
		}
		
		logger.info("process completely....");
	}
}
