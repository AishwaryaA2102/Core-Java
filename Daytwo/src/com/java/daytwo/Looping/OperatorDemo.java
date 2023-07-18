package com.java.daytwo.Looping;

public class OperatorDemo {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int x=10;
		System.out.println("a = "+a+" "+"b = "+b+" "+"x = "+x);
		//System.out.println(a++);
		++a;//11
		int c = ++a+b+a--;//12+20+12=44
		System.out.println("value of c is "+c);
		int d = c++ +a +b--;//44+11+20=75
		System.out.println("value of d is "+d);
		System.out.println("value of b is "+b);
		

	}

}
