package com.java.aop05;

public class AopTest {
	// �ٽ� Ŭ���� -> �ٽ�Ŭ�������� �����ϴ� �ٽɸ޼ҵ尡 ����Ŭ�����ȿ��� �����ɿ����� �Ѵ� !
	public void method1() {
		System.out.println("�ٽɱ��(����Ͻ�����) method1 ȣ��");
	}
	public void method2() {
		System.out.println("�ٽɱ��(����Ͻ�����) method2 ȣ��");
	}
	public String method3() {
		System.out.println("�ٽɱ��(����Ͻ�����) method3 ȣ��");
		return null;
	}
	public int method4() {
		System.out.println("�ٽɱ��(����Ͻ�����) method4 ȣ��");
		return 0;
	}
}