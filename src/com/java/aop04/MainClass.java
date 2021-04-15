package com.java.aop04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/java/aop04/appCTX.xml");
		
		Person student = (Person) ctx.getBean("student");
		Person teacher = (Person) ctx.getBean("teacher");
		
		student.work();
		
		teacher.work();
		
		ctx.close();
		
		

	}

}
