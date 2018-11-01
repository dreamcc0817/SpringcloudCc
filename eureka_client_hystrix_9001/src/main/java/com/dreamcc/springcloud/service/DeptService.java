package com.dreamcc.springcloud.service;

import com.dreamcc.springcloud.api.entities.Dept;

import java.util.List;

/**
 * @Title: SpringcloudCc
 * @Package: com.dreamcc.springcloud
 * @Description:
 * @Author: dreamcc
 * @Date: 2018-10-11 11:44
 * @Version: V1.0
 */
public interface DeptService {
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
