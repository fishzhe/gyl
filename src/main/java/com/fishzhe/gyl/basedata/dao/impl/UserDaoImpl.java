package com.fishzhe.gyl.basedata.dao.impl;

import org.springframework.stereotype.Repository;

import com.fishzhe.gyl.base.dao.impl.BaseDaoImpl;
import com.fishzhe.gyl.basedata.dao.UserDao;
import com.fishzhe.gyl.domain.basedata.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

}
