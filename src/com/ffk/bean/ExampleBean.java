package com.ffk.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ExampleBean {
	
	public ExampleBean(){
		System.out.println("ʵ����examplebean");
	}
	
	public void execute(){
		System.out.println("ִ��example����");
	}
	
	@PostConstruct
	public void init(){
		System.out.println("��ʼ������");
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("���ٶ���");
	}
}
