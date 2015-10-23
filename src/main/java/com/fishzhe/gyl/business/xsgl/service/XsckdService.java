package com.fishzhe.gyl.business.xsgl.service;

import java.util.List;

import com.fishzhe.gyl.business.base.service.BaseBusinessService;
import com.fishzhe.gyl.domain.business.xsgl.Xsckdzhib;
import com.fishzhe.gyl.domain.business.xsgl.Xsckdzhub;

public interface XsckdService extends BaseBusinessService<Xsckdzhub, Xsckdzhib>{
	public void saveXsckd(Xsckdzhub xsckdzhub,List<Xsckdzhib> xsckdzhibs);
}
