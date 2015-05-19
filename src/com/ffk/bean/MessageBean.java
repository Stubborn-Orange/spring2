package com.ffk.bean;

import java.sql.Struct;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MessageBean {
	
	private String moduleName;
	private int pageSize;
	private String username;
	private String password = "";
	
	private List<String> someList;
	private Set<String> somesSet;
	private Map<String, Object> someMap;
	private Properties someProps;
	
	
	/** 
	 * @return someList 
	 */
	public List<String> getSomeList() {
		return someList;
	}
	/**
	 * @param someList the someList to set
	 */
	public void setSomeList(List<String> someList) {
		this.someList = someList;
	}
	/** 
	 * @return somesSet 
	 */
	public Set<String> getSomesSet() {
		return somesSet;
	}
	/**
	 * @param somesSet the somesSet to set
	 */
	public void setSomesSet(Set<String> somesSet) {
		this.somesSet = somesSet;
	}
	/** 
	 * @return someMap 
	 */
	public Map<String, Object> getSomeMap() {
		return someMap;
	}
	/**
	 * @param someMap the someMap to set
	 */
	public void setSomeMap(Map<String, Object> someMap) {
		this.someMap = someMap;
	}
	/** 
	 * @return someProps 
	 */
	public Properties getSomeProps() {
		return someProps;
	}
	/**
	 * @param someProps the someProps to set
	 */
	public void setSomeProps(Properties someProps) {
		this.someProps = someProps;
	}
	/** 
	 * @return moduleName 
	 */
	public String getModuleName() {
		return moduleName;
	}
	/**
	 * @param moduleName the moduleName to set
	 */
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	/** 
	 * @return pageSize 
	 */
	public int getPageSize() {
		return pageSize;
	}
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/** 
	 * @return username 
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/** 
	 * @return password 
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute(){
		System.out.println("moduleName" + moduleName);
		System.out.println("pageSize=" + pageSize);
		System.out.println("username=" + username);
		System.out.println("password=" + password);
		System.out.println("--List信息如下--");
		for (String s:someList){
			System.out.println(s);
		}
		System.out.println("set信息如下");
		for(String s:somesSet){
			System.out.println(s);
		}
		System.out.println("map信息如下");
		Set<String> keys = someMap.keySet();
		for(String key :keys){
			System.out.println(key + "=" + someMap.get(key));
		}
		System.out.println("--Properties信息如下--");
		Set<Object> keys1 = someProps.keySet();
		for(Object key:keys1){
			System.out.println(key + "=" + someProps.getProperty(key.toString()));
		}
		return "success";
	}
	
}
