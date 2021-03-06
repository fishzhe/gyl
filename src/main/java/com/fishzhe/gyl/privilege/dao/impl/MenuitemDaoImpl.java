package com.fishzhe.gyl.privilege.dao.impl;

import org.springframework.stereotype.Repository;

import com.fishzhe.gyl.base.dao.impl.BaseDaoImpl;
import com.fishzhe.gyl.domain.privilege.Menuitem;
import com.fishzhe.gyl.privilege.dao.MenuitemDao;

@Repository("menuitemDao")
public class MenuitemDaoImpl extends BaseDaoImpl<Menuitem> implements MenuitemDao{

}
