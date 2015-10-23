package com.fishzhe.gyl.basedata.dao.impl;

import org.springframework.stereotype.Repository;

import com.fishzhe.gyl.base.dao.impl.BaseDaoImpl;
import com.fishzhe.gyl.basedata.dao.ProductDao;
import com.fishzhe.gyl.domain.basedata.Product;

@Repository("productDao")
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao{

}
