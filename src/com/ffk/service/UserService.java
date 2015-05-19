package com.ffk.service;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ffk.dao.UserDao;
import com.ffk.entity.User;


/*业务层注解*/
@Service
public class UserService implements Serializable{
	
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}
	
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	/*登陆系统功能*/
	public User login(String name,String pwd){
		try {
			User user = userDao.findByName(name);
			if (user.getPwd().equals(pwd)) {
				return user;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
		
}
