//To demonstrate how to create objects using constructors
package com.java.daythree.constructordemo;
import java.util.Scanner;
public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			String name;
			int Id;
			double Phone;
			
        	System.out.println("Enter Id");
        	Id=sc.nextInt();
        	System.out.println("Enter name");
        	name=sc.next();
        	System.out.println("Enter Phone");
        	Phone=sc.nextDouble();
        	
        	Customer c3=new Customer(Id,name,Phone);
        	System.out.println(c3);
        	    
        	    
        	    
        	    
        	    
        		
	}

}
