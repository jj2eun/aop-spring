package com.java.aop04;

import org.aspectj.lang.ProceedingJoinPoint;

public class PAspect {
	public void sub(ProceedingJoinPoint joinPoint) {
		try {
			// �ٽ��Լ� ��
			System.out.println("������ �Խ�!!!");
			// �ٽ� �ڵ� -> ���⼭ aop ����ȴ�
			joinPoint.proceed();
			// ���������� ����Ǿ��� ��
			System.out.println("���ɽĻ縦 ������ �Ѵ�~!~!!~!!");
		} catch (Throwable e) {
			// execption �߻� ��
			System.out.println("���� �Ѱܳ��� !");
		} finally {
			// �ٽ��Լ� ���� ��
			System.out.println("������!!!�������� ������");
		}
	}
	
	
}
