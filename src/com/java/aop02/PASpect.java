package com.java.aop02;

import org.aspectj.lang.JoinPoint;

public class PASpect { // ����Ŭ���� : aspect
	
	public void awake(JoinPoint joinPoint) { // �����Լ� : advice
		System.out.println("�Ͼ��");		// JoinPoint : �ٽ��ڵ带 �����´�
	}

	public void sleep(JoinPoint joinPoint) { // �����Լ� : advice
		System.out.println("�����ܴ�");
		
	}
}
