package com.java.aop03;

import java.util.Scanner;

public class Student implements Person{

	@Override
	public void work() {
		System.out.println("�л��� ���θ� �Ѵ�.");
		
		System.out.println("�� �Է�: ");
		Scanner sc = new Scanner(System.in);

		int su = sc.nextInt();
		
		if(su==5) {
			System.out.println(su/0);
		}
		sc.close();
	}
	
}
