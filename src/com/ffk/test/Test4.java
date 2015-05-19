package com.ffk.test;

import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ffk.dao.JDBCDataSource;
import com.ffk.dao.UserDao;
import com.ffk.entity.User;
import com.ffk.service.UserService;

public class Test4 {
	
	 @Test
	    public void testLogin(){
	        String config = "applicationContext.xml";
	        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
	        UserService service = ac.getBean("userService", UserService.class);
	        UserDao dao = service.getUserDao();
	        System.out.println(dao); 
	        User u = service.login("Tom", "123");
	        System.out.println(u); 
	    }
	
}
