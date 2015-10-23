package com.fishzhe.gyl.privilege.service;

import java.util.Collection;

import com.fishzhe.gyl.base.service.BaseService;
import com.fishzhe.gyl.domain.privilege.Privilege;

public interface PrivilegeService extends BaseService<Privilege>{
	public Collection<Privilege> getPrivilegesByRoleid(Long rid);
	
	public Collection<Privilege> getMenuitemTreeByUid(Long uid);
	
	public Collection<Privilege> getFunctionTreeByUid(Long uid);
}
