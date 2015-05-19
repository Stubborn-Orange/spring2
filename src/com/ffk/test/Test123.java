package com.ffk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ffk.bean.MessageBean;





public class Test123 {
	public static void main(String[] args) {
		String conf = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		MessageBean bean = ac.getBean("messagebean",MessageBean.class);
		bean.execute();
	}
	
}
