package com.dreamcc.springcloud.consumer.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

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
@EnableFeignClients(basePackages = {"com.dreamcc.springcloud"})
@ComponentScan("com.dreamcc.springcloud.api.entities")
@EnableAutoConfiguration
public class ConsumerDept80FeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerDept80FeignApplication.class, args);
	}
}
