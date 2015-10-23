package com.fishzhe.gyl.business.xsgl.service;

import java.util.List;

import com.fishzhe.gyl.business.base.service.BaseBusinessService;
import com.fishzhe.gyl.domain.business.xsgl.Xskpzhib;
import com.fishzhe.gyl.domain.business.xsgl.Xskpzhub;

public interface XskpService extends BaseBusinessService<Xskpzhub, Xskpzhib>{
	public void saveXskp(Xskpzhub xskpzhub,List<Xskpzhib> xskpzhibs);
}
