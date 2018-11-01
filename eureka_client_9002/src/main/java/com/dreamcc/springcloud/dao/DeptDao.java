package com.dreamcc.springcloud.dao;

import com.dreamcc.springcloud.api.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Title: SpringcloudCc
 * @Package: com.dreamcc.springcloud.dao
 * @Description:
 * @Author: dreamcc
 * @Date: 2018-10-11 11:42
 * @Version: V1.0
 */
@Mapper
public interface DeptDao {
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}