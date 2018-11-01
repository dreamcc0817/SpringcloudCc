package com.dreamcc.springcloud.api.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Title: SpringcloudCc
 * @Package: com.dreamcc.springcloudcc.api.entities
 * @Description:
 * @Author: dreamcc
 * @Date: 2018-10-11 10:52
 * @Version: V1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
	private Long deptno; // 主键
	private String dname; // 部门名称
	private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
}
