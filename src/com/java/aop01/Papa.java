package com.java.aop01;

public class Papa implements Person{

	@Override
	public void awake() {
		System.out.println("�Ͼ��");
	}

	@Override
	public void work() {
		System.out.println("Papa work");
		
	}

	@Override
	public void sleep() {
		System.out.println("�����ܴ�");
		
	}

}
