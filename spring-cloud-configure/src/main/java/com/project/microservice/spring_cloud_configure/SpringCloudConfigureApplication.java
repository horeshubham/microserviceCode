package com.project.microservice.spring_cloud_configure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigureApplication.class, args);
	}

}
