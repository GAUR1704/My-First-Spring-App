package com.prowings.circularDependency;

public class B {

	private A a;

	public B() {
		super();
		System.out.println("Inside B's no arg constructor !!!!");
	}

	public B(A a) {
		super();
		this.a = a;
		System.out.println("Inside B(A a) constructor !!");
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
		System.out.println("inside setter method of Class B - setA()");
	}

}
