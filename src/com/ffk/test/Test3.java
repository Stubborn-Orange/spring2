package com.ffk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ffk.bean.ExampleBean;

public class Test3 {

	public static void main(String[] args) throws Exception{
        String conf = "applicationContext.xml";
        AbstractApplicationContext ac =
        		new ClassPathXmlApplicationContext(conf);
        ExampleBean bean1 = ac.getBean("exampleBean",ExampleBean.class);
        ExampleBean bean2 = ac.getBean("exampleBean",ExampleBean.class);
        System.out.println(bean1==bean2);
        ac.close();
    }
}
