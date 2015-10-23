package com.fishzhe.gyl.privilege.service;

import java.util.Collection;

import com.fishzhe.gyl.base.service.BaseService;
import com.fishzhe.gyl.domain.privilege.Role;

public interface RoleService extends BaseService<Role>{
	public Role getRoleByName(String name);
	public Collection<Role> getRoleByUid(Long uid);
}
