package com.java.aop05;

import org.aspectj.lang.ProceedingJoinPoint;
// ���� Ŭ����
public class AopAspect {
	// ����Ŭ������ �޼ҵ�
	public void before() {
		System.out.println("���� ��� before ����");
	}
	
	public void after() {
		System.out.println("���� ��� after ����");
	}
	
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("���� ��� before ����");
		pjp.proceed();
		System.out.println("���� ��� after ����");
	}
}
