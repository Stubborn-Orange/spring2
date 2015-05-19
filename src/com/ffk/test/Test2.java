package com.ffk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ffk.bean.ExampleBean;



public class Test2 {

	public static void main(String[] args) {
		String conf = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		ExampleBean bean = ac.getBean("exampleBean" ,ExampleBean.class);
		bean.execute();
	}
}
