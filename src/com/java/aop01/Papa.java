package com.java.aop01;

public class Papa implements Person{

	@Override
	public void awake() {
		System.out.println("일어난다");
	}

	@Override
	public void work() {
		System.out.println("Papa work");
		
	}

	@Override
	public void sleep() {
		System.out.println("잠을잔다");
		
	}

}
