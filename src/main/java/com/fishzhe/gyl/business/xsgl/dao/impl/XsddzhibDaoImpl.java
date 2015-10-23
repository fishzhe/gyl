package com.fishzhe.gyl.business.xsgl.dao.impl;

import org.springframework.stereotype.Repository;

import com.fishzhe.gyl.base.dao.impl.BaseDaoImpl;
import com.fishzhe.gyl.business.xsgl.dao.XsddzhibDao;
import com.fishzhe.gyl.domain.business.xsgl.Xsddzhib;

@Repository("xsddzhibDao")
public class XsddzhibDaoImpl extends BaseDaoImpl<Xsddzhib> implements XsddzhibDao{

	@Override
	public Xsddzhib getXsddzhibByCondition(String ytdjh, Long ythh) {
		// TODO Auto-generated method stub
		return (Xsddzhib)this.hibernateTemplate.find("from Xsddzhib where xsddzhub.ddh=? and hh=?",ytdjh,ythh).get(0);
	}
}
