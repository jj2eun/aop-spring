package com.java.aop03;

import java.util.Scanner;

public class Student implements Person{

	@Override
	public void work() {
		System.out.println("학생은 공부를 한다.");
		
		System.out.println("수 입력: ");
		Scanner sc = new Scanner(System.in);

		int su = sc.nextInt();
		
		if(su==5) {
			System.out.println(su/0);
		}
		sc.close();
	}
	
}
