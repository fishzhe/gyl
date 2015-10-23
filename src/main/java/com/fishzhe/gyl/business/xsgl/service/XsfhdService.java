package com.fishzhe.gyl.business.xsgl.service;

import java.util.List;

import com.fishzhe.gyl.business.base.service.BaseBusinessService;
import com.fishzhe.gyl.domain.business.xsgl.Xsfhdzhib;
import com.fishzhe.gyl.domain.business.xsgl.Xsfhdzhub;

public interface XsfhdService extends BaseBusinessService<Xsfhdzhub, Xsfhdzhib>{
	public void saveXsfhd(Xsfhdzhub xsfhdzhub,List<Xsfhdzhib> xsfhdzhibs);
}
