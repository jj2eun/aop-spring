package com.java.aop05;

import org.aspectj.lang.ProceedingJoinPoint;
// 공통 클래스
public class AopAspect {
	// 공통클래스의 메소드
	public void before() {
		System.out.println("공통 기능 before 실행");
	}
	
	public void after() {
		System.out.println("공통 기능 after 실행");
	}
	
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("공통 기능 before 실행");
		pjp.proceed();
		System.out.println("공통 기능 after 실행");
	}
}
