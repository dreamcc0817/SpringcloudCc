package com.dreamcc.springcloud.eureka.server.server8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Server8002Application {

	public static void main(String[] args) {
		SpringApplication.run(Server8002Application.class,args);
//		new SpringApplicationBuilder(Server8002Application.class).web(WebApplicationType.SERVLET).run(args);
	}
}
