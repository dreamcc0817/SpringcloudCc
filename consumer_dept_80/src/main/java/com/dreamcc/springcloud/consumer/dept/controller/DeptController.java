package com.dreamcc.springcloud.consumer.dept.controller;

import com.dreamcc.springcloud.api.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Title: SpringcloudCc
 * @Package: com.dreamcc.springclound.consumer.dept.controller
 * @Description:
 * @Author: dreamcc
 * @Date: 2018-10-11 14:23
 * @Version: V1.0
 */
@RestController
public class DeptController {

//	private static final String REST_URL_PREFIX = "http://localhost:9001";springcloudcc-dept
	private static final String REST_URL_PREFIX = "http://SPRINGCLOUDCC-DEPT";
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
	}

}
