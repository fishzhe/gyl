package com.fishzhe.gyl.privilege.service.impl;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fishzhe.gyl.base.dao.BaseDao;
import com.fishzhe.gyl.base.service.impl.BaseServiceImpl;
import com.fishzhe.gyl.domain.privilege.Role;
import com.fishzhe.gyl.privilege.dao.RoleDao;
import com.fishzhe.gyl.privilege.service.RoleService;

@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService{
	@Resource(name="roleDao")
	private RoleDao roleDao;

	@Override
	public BaseDao getBaseDao() {
		// TODO Auto-generated method stub
		return this.roleDao;
	}

	@Override
	public Role getRoleByName(String name) {
		// TODO Auto-generated method stub
		return this.roleDao.getRoleByName(name);
	}

	@Override
	public Collection<Role> getRoleByUid(Long uid) {
		// TODO Auto-generated method stub
		return this.roleDao.getRoleByUid(uid);
	}	
}
