package com.fishzhe.gyl.basedata.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fishzhe.gyl.base.dao.BaseDao;
import com.fishzhe.gyl.base.service.impl.BaseServiceImpl;
import com.fishzhe.gyl.basedata.dao.UserDao;
import com.fishzhe.gyl.basedata.service.UserService;
import com.fishzhe.gyl.domain.basedata.User;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{
	@Resource(name="userDao")
	private UserDao userDao;
	@Override
	public BaseDao getBaseDao() {
		// TODO Auto-generated method stub
		return this.userDao;
	}
	
}
