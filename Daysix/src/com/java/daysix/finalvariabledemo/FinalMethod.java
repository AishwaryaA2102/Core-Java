package com.java.daysix.finalvariabledemo;

public class FinalMethod {
	final int a=30;

	 public FinalMethod() {
		 System.out.println("Default constructor");

	 }

	 //final method
	 void show()
	 {
		System.out.println("value of variable a "+a); 
	 }

	 public String print()
	 {
		 return "hello";
	 }
}
