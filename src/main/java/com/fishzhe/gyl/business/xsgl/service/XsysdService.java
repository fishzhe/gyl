package com.fishzhe.gyl.business.xsgl.service;

import java.util.List;

import com.fishzhe.gyl.business.base.service.BaseBusinessService;
import com.fishzhe.gyl.domain.business.xsgl.Xsyddzhib;
import com.fishzhe.gyl.domain.business.xsgl.Xsyddzhub;
import com.fishzhe.gyl.domain.business.xsgl.Xsysdzhib;
import com.fishzhe.gyl.domain.business.xsgl.Xsysdzhub;

public interface XsysdService extends BaseBusinessService<Xsysdzhub, Xsysdzhib>{
	public void saveXsysd(Xsysdzhub xsysdzhub,List<Xsysdzhib> xsysdzhibs);
}
