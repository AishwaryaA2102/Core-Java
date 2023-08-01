package com.java.daythree.constructordemo;

public class Customer {
    //data member
	private int CustomerId;
	private String name;
	private double Phone;
	//initializing the data members
	public Customer()
	{
		CustomerId=100;
		name="Lata";
		Phone=5865885;
	}
	//Parameterized Constructor
	public Customer(int customerId, String name, double phone) {
		this();//calling the default constructor
		this.CustomerId = customerId;
		this.name = name;
		this.Phone = phone;
	}
	
	//getter and setter methods
	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return CustomerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public double getPhone() {
		return Phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(double phone) {
		Phone = phone;
	}
	
	//to-string method
	
	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", name=" + name + ", Phone=" + Phone + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
