package com.lifotech.spring.beans;

public class ClassA {
	private ClassB dependency;
	
	public ClassB getDependency() {
		return dependency;
	}

	public void setDependency(ClassB dependency) {
		this.dependency = dependency;
	}

	public void businessMethod()
	{
		System.out.println(dependency.getValue());
	}
	
	public void createdBeanA()
	{
		System.out.println("created bean a");
	}
}
