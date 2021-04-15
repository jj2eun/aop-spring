package com.java.aop01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/java/aop01/appCTX.xml");
		
		Person papa = (Person) ctx.getBean("papa");
		papa.awake();
		papa.work();
		papa.sleep();
		
		Person mom = (Person) ctx.getBean("mom");
		
		mom.awake();

	}

}
