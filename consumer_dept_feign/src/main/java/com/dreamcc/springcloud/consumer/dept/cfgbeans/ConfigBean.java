package com.dreamcc.springcloud.consumer.dept.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: SpringcloudCc
 * @Package: com.dreamcc.springcloud.consumer.dept.cfgbeans
 * @Description:
 * @Author: dreamcc
 * @Date: 2018-10-11 14:19
 * @Version: V1.0
 */
@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
