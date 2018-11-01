package com.dreamcc.springcloud.service.impl;

import com.dreamcc.springcloud.dao.DeptDao;
import com.dreamcc.springcloud.service.DeptService;
import com.dreamcc.springcloud.api.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title: SpringcloudCc
 * @Package: com.dreamcc.springcloud.service.impl
 * @Description:
 * @Author: dreamcc
 * @Date: 2018-10-11 11:46
 * @Version: V1.0
 */
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptDao dao;

	@Override
	public boolean add(Dept dept) {
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return dao.findAll();
	}

}