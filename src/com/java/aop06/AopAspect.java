package com.java.aop06;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopAspect {
	// 핵심기능 설정
	@Pointcut("execution(void com.java.aop06..*(..))")
	private void pointCut() {
		
	}
	@Pointcut("execution(int com.java.aop06..*(..))")
	private void pointCut2() {
		
	}
	
	// 공통기능 설정
	@Before("pointCut()")
	public void before() {
		System.out.println("공통 기능 before 실행");
	}
	@After("pointCut()")
	public void after() {
		System.out.println("공통 기능 after 실행");
	}
	@Around("pointCut2()")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("공통 기능 이전 실행");
		pjp.proceed();
		System.out.println("공통 기능 이후 실행");
	}
}
