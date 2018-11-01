package com.dreamcc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Title: SpringcloudCc
 * @Package: com.dreamcc.springcloud
 * @Description:
 * @Author: dreamcc
 * @Date: 2018-10-11 11:50
 * @Version: V1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class EurekaClient9001Application {
	public static void main(String[] args) {
		SpringApplication.run(EurekaClient9001Application.class, args);
	}
}
