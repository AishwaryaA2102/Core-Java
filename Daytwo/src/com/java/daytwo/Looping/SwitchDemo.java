package com.java.daytwo.Looping;

public class SwitchDemo {

	public static void main(String[] args) {
		char x ='l';
		switch(x)
		{
		case 'd':
		case 'D':
			System.out.println(x+ " is adidit");
			break;
		case 'w':
		case 'W':
			System.out.println(x+ " is whitespace");
			break;
		case 'l':
		case 'L':
			System.out.println(x+ " is letter");
			break;
		case 's':
		case 'S':
			System.out.println(x+ " is Special Character");
		default:
			System.out.println(x+ " is not digit,whitespace,letter,Special Character");
			break;
		}
		System.out.println("End of the program");

	}

}
