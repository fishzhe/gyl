package com.fishzhe.gyl.basedata.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fishzhe.gyl.base.dao.BaseDao;
import com.fishzhe.gyl.base.service.impl.BaseServiceImpl;
import com.fishzhe.gyl.basedata.dao.ProductDao;
import com.fishzhe.gyl.basedata.service.ProductService;
import com.fishzhe.gyl.domain.basedata.Product;
@Service("productService")
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService{
	@Resource(name="productDao")
	private ProductDao productDao;
	@Override
	public BaseDao getBaseDao() {
		// TODO Auto-generated method stub
		return this.productDao;
	}

}
