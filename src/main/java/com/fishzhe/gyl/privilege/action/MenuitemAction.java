package com.fishzhe.gyl.privilege.action;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.fishzhe.gyl.base.action.BaseAction;
import com.fishzhe.gyl.domain.privilege.Menuitem;
import com.fishzhe.gyl.privilege.service.MenuitemService;
import com.opensymphony.xwork2.ActionContext;

@Controller("menuitemAction")
@Scope("prototype")
public class MenuitemAction extends BaseAction<Menuitem>{
	@Resource(name="menuitemService")
	private MenuitemService menuitemService;
	
	public String showMenuitemTree(){
		Collection<Menuitem> menuitems = this.menuitemService.getEntries();
		ActionContext.getContext().getValueStack().push(menuitems);
		return SUCCESS;
	}
}
