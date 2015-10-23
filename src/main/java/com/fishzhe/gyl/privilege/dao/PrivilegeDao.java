package com.fishzhe.gyl.privilege.dao;

import java.util.Collection;

import com.fishzhe.gyl.base.dao.BaseDao;
import com.fishzhe.gyl.domain.privilege.Privilege;

public interface PrivilegeDao extends BaseDao<Privilege>{
	public Collection<Privilege> getPrivilegesByRid(Long rid);
	
	public Collection<Privilege> getMenuitemTreeByUid(Long uid);
	
	public Collection<Privilege> getFunctionByUid(Long uid);
}
