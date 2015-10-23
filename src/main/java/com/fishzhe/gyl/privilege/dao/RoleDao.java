package com.fishzhe.gyl.privilege.dao;

import java.util.Collection;

import com.fishzhe.gyl.base.dao.BaseDao;
import com.fishzhe.gyl.domain.privilege.Role;

public interface RoleDao extends BaseDao<Role>{
	public Role getRoleByName(final String name);
	public Collection<Role> getRoleByUid(Long uid);
}
