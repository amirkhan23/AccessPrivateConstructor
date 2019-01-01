package com.accessPrivateConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com//accessPrivateConstructor//resources//spring.xml");

		ConstructorAccess constructorAccess = (ConstructorAccess) applicationContext.getBean("ConstructorAccess");
		constructorAccess.disp();
	}
}