package com.tuodao.bp.biz.operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OperationApplication {
	public static void main(String[] args) {
		SpringApplication.run(OperationApplication.class, args);
	}
}
