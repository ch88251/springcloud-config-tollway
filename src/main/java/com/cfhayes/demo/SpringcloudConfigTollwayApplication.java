package com.cfhayes.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudConfigTollwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigTollwayApplication.class, args);
	}

}
