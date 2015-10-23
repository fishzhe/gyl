package com.fishzhe.gyl.business.xsgl.dao;

import java.util.List;

import com.fishzhe.gyl.base.dao.BaseDao;
import com.fishzhe.gyl.domain.business.xsgl.Xsddzhib;
import com.fishzhe.gyl.domain.business.xsgl.Xsddzhub;

public interface XsddzhubDao extends BaseDao<Xsddzhub>{
	public List<Xsddzhib> getXsddzhibByDDH(String ddh);
	public Xsddzhub getXsddzhubByDDH(String ddh);
}
