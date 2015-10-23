package com.fishzhe.gyl.basedata.dao.impl;

import org.springframework.stereotype.Repository;

import com.fishzhe.gyl.base.dao.impl.BaseDaoImpl;
import com.fishzhe.gyl.basedata.dao.DepartmentDao;
import com.fishzhe.gyl.domain.basedata.Department;

@Repository("departmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao{

}
