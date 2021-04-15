package com.java.aop03;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;

public class PAspect {
	public void open(JoinPoint joinPoint) {
		System.out.println("수업 시작! 강의장에 들어온다");
	}
	
	public void close(JoinPoint joinPoint) {
		System.out.println("수업 끝! 강의장을 나간다");
	}
	public void error(JoinPoint joinPoint) {
		System.out.println("떠들어서 쫓겨났따");
	}
	public void eat(JoinPoint joinPoint) {
		System.out.println("점심을 맛잇게 먹는닫");
	}
}
