package com.java.aop03;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;

public class PAspect {
	public void open(JoinPoint joinPoint) {
		System.out.println("���� ����! �����忡 ���´�");
	}
	
	public void close(JoinPoint joinPoint) {
		System.out.println("���� ��! �������� ������");
	}
	public void error(JoinPoint joinPoint) {
		System.out.println("���� �Ѱܳ���");
	}
	public void eat(JoinPoint joinPoint) {
		System.out.println("������ ���հ� �Դ´�");
	}
}
