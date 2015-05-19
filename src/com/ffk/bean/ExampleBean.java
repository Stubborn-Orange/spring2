package com.ffk.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ExampleBean {
	
	public ExampleBean(){
		System.out.println("实例化examplebean");
	}
	
	public void execute(){
		System.out.println("执行example处理");
	}
	
	@PostConstruct
	public void init(){
		System.out.println("初始化对象");
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("销毁对象");
	}
}
