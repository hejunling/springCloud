package com.tuodao.bp.api.facade.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tuodao.bp.model.output.member.DemoOuput;

@FeignClient(value="BIZ-USER-ACCOUNT")
public interface DemoService {
	
	@RequestMapping(value="/demo/getDemo",method=RequestMethod.POST)
	public DemoOuput getDemo(@RequestParam(value="name") String name);
}
