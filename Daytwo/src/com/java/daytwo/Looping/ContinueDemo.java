package com.java.daytwo.Looping;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int k=1;k<15;k++) {
			if(k%2!=0)//skip all odd number
				continue;
			System.out.println(k+"");
		}

	}

}
