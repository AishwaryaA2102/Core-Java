package com.java.daysix.finalvariabledemo;

public class finalmethoddemo extends FinalMethod {
	@Override
	public void show()
	 {
		System.out.println("Hello"); 
	 }

	@Override
	 public String print()
	 {
		 return "Hi";
	 }

	public static void main(String[] args) {
		FinalMethod fm=new FinalMethod();
		fm.show();


	}
}
