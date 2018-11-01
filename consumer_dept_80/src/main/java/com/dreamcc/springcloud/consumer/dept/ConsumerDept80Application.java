package com.dreamcc.springcloud.consumer.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Title: SpringcloudCc
 * @Package: com.dreamcc.springcloud.consumer.dept
 * @Description:
 * @Author: dreamcc
 * @Date: 2018-10-11 14:26
 * @Version: V1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerDept80Application {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerDept80Application.class, args);
	}
}
