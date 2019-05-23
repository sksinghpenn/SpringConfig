package com.lifotech.spring.beans;

public class ClassB {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void destroyedBeanB()
	{
		System.out.println("Bean B now dead!");
	}
	
}
