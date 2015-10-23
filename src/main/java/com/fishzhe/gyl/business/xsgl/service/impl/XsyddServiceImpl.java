package com.fishzhe.gyl.business.xsgl.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fishzhe.gyl.base.dao.BaseDao;
import com.fishzhe.gyl.business.base.service.impl.BaseBusinessServiceImpl;
import com.fishzhe.gyl.business.xsgl.dao.XsyddzhibDao;
import com.fishzhe.gyl.business.xsgl.dao.XsyddzhubDao;
import com.fishzhe.gyl.business.xsgl.service.XsyddService;
import com.fishzhe.gyl.domain.business.xsgl.Xsyddzhib;
import com.fishzhe.gyl.domain.business.xsgl.Xsyddzhub;

@Service("xsyddService")
public class XsyddServiceImpl extends BaseBusinessServiceImpl<Xsyddzhub, Xsyddzhib> implements XsyddService{
	@Resource(name="xsyddzhubDao")
	private XsyddzhubDao xsyddzhubDao;
	@Resource(name="xsyddzhibDao")
	private XsyddzhibDao xsyddzhibDao;
	@Override
	public BaseDao<Xsyddzhub> getBaseDao_zhu() {
		// TODO Auto-generated method stub
		return this.xsyddzhubDao;
	}
	@Override
	public BaseDao<Xsyddzhib> getBaseDao_zhi() {
		// TODO Auto-generated method stub
		return this.xsyddzhibDao;
	}
}
