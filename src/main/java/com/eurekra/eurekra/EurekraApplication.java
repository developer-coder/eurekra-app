package com.eurekra.eurekra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekraApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekraApplication.class, args);
	}

}
//site to practice problem statement for company interview for chatgpt