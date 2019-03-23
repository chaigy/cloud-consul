package com.cgy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConsulMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsulMemberApplication.class, args);
	}

}
