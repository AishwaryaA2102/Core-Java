//driver class of OopsDemo
package com.java.daythree.encapsulationdemo;

public class EncapsulationDemo {

	public static void main(String[] args) {
		OopsDemo oops=new OopsDemo();
		
		
		oops.setAge(23);
		oops.setName("Tushar");
		oops.setSerialNum(2);//set values using getter/setter
		System.out.println(oops.getAge());
		System.out.println(oops.getName());
		System.out.println(oops.getSerialNum());//set values using getter/setter
		
		System.out.println(oops);
		
		
		

	}

	@Override
	public String toString() {
		return "EncapsulationDemo [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
