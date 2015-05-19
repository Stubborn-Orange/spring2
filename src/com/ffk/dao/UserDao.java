package com.ffk.dao;

import com.ffk.entity.User;

public interface UserDao {

	public User findByName(String name);
}
