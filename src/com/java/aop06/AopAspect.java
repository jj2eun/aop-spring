package com.java.aop06;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopAspect {
	// �ٽɱ�� ����
	@Pointcut("execution(void com.java.aop06..*(..))")
	private void pointCut() {
		
	}
	@Pointcut("execution(int com.java.aop06..*(..))")
	private void pointCut2() {
		
	}
	
	// ������ ����
	@Before("pointCut()")
	public void before() {
		System.out.println("���� ��� before ����");
	}
	@After("pointCut()")
	public void after() {
		System.out.println("���� ��� after ����");
	}
	@Around("pointCut2()")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("���� ��� ���� ����");
		pjp.proceed();
		System.out.println("���� ��� ���� ����");
	}
}
