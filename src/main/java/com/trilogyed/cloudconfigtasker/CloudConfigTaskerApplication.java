package com.trilogyed.cloudconfigtasker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigTaskerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigTaskerApplication.class, args);
	}

}
