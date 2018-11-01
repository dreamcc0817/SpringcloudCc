package com.dreamcc.springcloud.controller;

import com.dreamcc.springcloud.service.DeptService;
import com.dreamcc.springcloud.api.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Title: SpringcloudCc
 * @Package: com.dreamcc.springcloud.controller
 * @Description:
 * @Author: dreamcc
 * @Date: 2018-10-11 11:43
 * @Version: V1.0
 */
@RestController
public class DeptController {
	@Autowired
	private DeptService service;
//	@Autowired
//	private DiscoveryClient client;

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return service.add(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return service.list();
	}


}