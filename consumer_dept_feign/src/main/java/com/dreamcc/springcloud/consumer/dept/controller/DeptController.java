package com.dreamcc.springcloud.consumer.dept.controller;

import com.dreamcc.springcloud.api.entities.Dept;
import com.dreamcc.springcloud.api.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@Autowired
	private DeptClientService service = null;

	@RequestMapping(value = "/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.service.get(id);
	}

	@RequestMapping(value = "/dept/list")
	public List<Dept> list() {
		return this.service.list();
	}

	@RequestMapping(value = "/dept/add")
	public Object add(Dept dept) {
		return this.service.add(dept);
	}

}
