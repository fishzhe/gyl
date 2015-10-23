package com.fishzhe.gyl.privilege.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fishzhe.gyl.base.dao.BaseDao;
import com.fishzhe.gyl.base.service.impl.BaseServiceImpl;
import com.fishzhe.gyl.domain.privilege.Menuitem;
import com.fishzhe.gyl.privilege.dao.MenuitemDao;
import com.fishzhe.gyl.privilege.service.MenuitemService;

@Service("menuitemService")
public class MenuitemServiceImpl extends BaseServiceImpl<Menuitem> implements MenuitemService{
	@Resource(name="menuitemDao")
	private MenuitemDao menuitemDao;
	@Override
	public BaseDao getBaseDao() {
		// TODO Auto-generated method stub
		return this.menuitemDao;
	}
}
