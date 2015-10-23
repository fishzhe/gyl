package com.fishzhe.gyl.business.xsgl.dao;

import java.util.List;

import com.fishzhe.gyl.base.dao.BaseDao;
import com.fishzhe.gyl.domain.business.xsgl.Xsfhdzhib;

public interface XsfhdzhibDao extends BaseDao<Xsfhdzhib>{
	public List<Xsfhdzhib> getXsfhdzhibByCondition(String ytdjh,Long ythh);
}
