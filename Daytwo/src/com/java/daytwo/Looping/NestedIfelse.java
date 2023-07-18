package com.java.daytwo.Looping;

public class NestedIfelse {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		System.out.println("Largest number is");
		if(a>b) {
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		else
			if(c>b)
				System.out.println(c);
			else
				System.out.println(c);

	}

}
