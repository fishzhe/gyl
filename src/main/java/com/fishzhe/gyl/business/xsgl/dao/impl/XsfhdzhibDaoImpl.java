package com.fishzhe.gyl.business.xsgl.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fishzhe.gyl.base.dao.impl.BaseDaoImpl;
import com.fishzhe.gyl.business.xsgl.dao.XsfhdzhibDao;
import com.fishzhe.gyl.domain.business.xsgl.Xsfhdzhib;

@Repository("xsfhdzhibDao")
public class XsfhdzhibDaoImpl extends  BaseDaoImpl<Xsfhdzhib> implements XsfhdzhibDao{

	@Override
	public List<Xsfhdzhib> getXsfhdzhibByCondition(String ytdjh, Long ythh) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Xsfhdzhib where ytdjh=? and ythh=?",ytdjh,ythh);
	}
}
