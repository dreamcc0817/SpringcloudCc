package com.dreamcc.springcloud.eureka.server.server8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Server8003Application {

	public static void main(String[] args) {
		SpringApplication.run(Server8003Application.class, args);
//		new SpringApplicationBuilder(Server8003Application.class).web(WebApplicationType.SERVLET).run(args);
	}
}
