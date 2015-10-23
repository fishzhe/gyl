package com.fishzhe.gyl.basedata.action;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.fishzhe.gyl.base.action.BaseAction;
import com.fishzhe.gyl.basedata.service.ProductService;
import com.fishzhe.gyl.domain.basedata.Product;
import com.opensymphony.xwork2.ActionContext;

@Controller("productAction")
@Scope("prototype")
public class ProductAction extends BaseAction<Product>{
	@Resource(name="productService")
	private ProductService productService;
	
	public String showProduct(){
		Collection<Product> products = this.productService.getEntries();
		ActionContext.getContext().getValueStack().push(products);
		return SUCCESS;
	}
}	
