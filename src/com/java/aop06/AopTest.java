package com.java.aop06;


public class AopTest {
	// 핵심 클래스 -> 핵심클래스에서 동작하는 핵심메소드가 공통클래스안에서 공통기능역할을 한다 !
	public void method1() {
		System.out.println("핵심기능(비즈니스로직) method1 호출");
	}
	public void method2() {
		System.out.println("핵심기능(비즈니스로직) method2 호출");
	}
	public String method3() {
		System.out.println("핵심기능(비즈니스로직) method3 호출");
		return null;
	}
	public int method4() {
		System.out.println("핵심기능(비즈니스로직) method4 호출");
		return 0;
	}
}
