package com.demo.entity;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*Access private constructor by class class*/
public class Access1 extends Thread {

	public static void main(String args[]) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, ClassNotFoundException {

		@SuppressWarnings("rawtypes")
		Class c = Class.forName("com.demo.entity.ConstructorAccess");
		@SuppressWarnings("rawtypes")
		Constructor[] c1 = c.getDeclaredConstructors();
		c1[0].setAccessible(true);
		@SuppressWarnings("unused")
		ConstructorAccess ca = (ConstructorAccess) c1[0].newInstance(1);// passing
																		// parameter

	}

}
