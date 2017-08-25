package com.tuodao.bp.api.facade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import feign.Retryer;
import feign.Retryer.Default;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages= {"com.tuodao.bp.api.facade.service"})
public class ApiFacadeApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiFacadeApplication.class, args);
	}
	
	@Bean
	@Primary
	public Retryer retryer() {
		return new Default();
	}

}
