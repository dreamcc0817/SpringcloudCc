package com.dreamcc.springcloud.api.service;

import com.dreamcc.springcloud.api.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Title: SpringcloudCc
 * @Package: com.dreamcc.springclound.api.service
 * @Description:
 * @Author: dreamcc
 * @Date: 2018-10-15 13:58
 * @Version: V1.0
 */
@FeignClient(value ="SPRINGCLOUDCC-DEPT")
public interface DeptClientService {
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	Dept get(@PathVariable("id") long id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	List<Dept> list();

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	boolean add(Dept dept);

}
