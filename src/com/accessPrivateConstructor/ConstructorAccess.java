package com.accessPrivateConstructor;

public class ConstructorAccess {
	private ConstructorAccess() {
		System.out.println("Access 2");
	}

	private ConstructorAccess(int a) {
		System.out.println("Access " + a);
	}

	public void disp() {
		System.out.println("access method");
	}

}
