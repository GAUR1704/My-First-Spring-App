package com.prowings.beanlifecycle;

public class MyBean {
	
	private int id;
	private String name;
	
	public MyBean() {
		super();
	}

	public MyBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void myInitMedhod() {
		
		System.out.println("Inside myInitMethod");
		
	}
	
	public void myDestroyMethod() {
		
		System.out.println("Inside myDestroyMethod");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyBean [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
