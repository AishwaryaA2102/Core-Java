package com.java.dayfour.privateconstructordemo;

public class Myclassdemo {
	public static void main(String[] args) {
		//MyClass m1=new MyClass();

	   Myclass obj=Myclass.getObject();
	   Myclass obj1=Myclass.getObject();
	   System.out.println(obj==obj1);
	   System.out.println(obj);
	   System.out.println(obj1);



	}

}
