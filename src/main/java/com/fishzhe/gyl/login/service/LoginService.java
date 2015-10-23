package com.fishzhe.gyl.login.service;

import com.fishzhe.gyl.domain.basedata.User;

public interface LoginService {
	public User authentication(String username,String password);
}
