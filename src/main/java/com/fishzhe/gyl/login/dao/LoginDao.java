package com.fishzhe.gyl.login.dao;

import com.fishzhe.gyl.domain.basedata.User;

public interface LoginDao {
	public User authentication(String username,String password);
}
