//singleton class
package com.java.dayfour.privateconstructordemo;

public class Myclass {

	private Myclass()
	{
	System.out.println("MyClass object is created");
	}
	private static Myclass obj=null;

	//factory method
	public static Myclass getObject()
	{
		if(obj==null) {
		 obj=new Myclass(); //Lazy Initialization
		}
		return obj;
	}


}
