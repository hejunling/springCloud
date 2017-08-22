package org.biz.biz.useraccount;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserAccountApplication {
	public static void main(String[] args) {
		// SpringApplication.run(UserAccountApplication.class, args);
		new SpringApplicationBuilder(UserAccountApplication.class).web(true).run(args);
	}
}
