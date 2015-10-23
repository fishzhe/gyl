package com.fishzhe.gyl.basedata.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fishzhe.gyl.base.dao.BaseDao;
import com.fishzhe.gyl.base.service.impl.BaseServiceImpl;
import com.fishzhe.gyl.basedata.dao.DepartmentDao;
import com.fishzhe.gyl.basedata.service.DepartmentService;
import com.fishzhe.gyl.domain.basedata.Department;

@Service("departmentService")
public class DepartmentServiceImpl extends  BaseServiceImpl<Department> implements DepartmentService{
	@Resource(name="departmentDao")
	private DepartmentDao departmentDao;
	@Override
	public BaseDao getBaseDao() {
		// TODO Auto-generated method stub
		return this.departmentDao;
	}	
}
