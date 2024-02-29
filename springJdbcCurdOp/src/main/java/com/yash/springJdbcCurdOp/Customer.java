package com.yash.springJdbcCurdOp;

public class Customer 
{
	private int customerId;
	private String customerName;
	private String customerLastName;
	private int customerNumber;
	private String customerCity;
	
	
	public Customer() {
		super();
	}
	public Customer(int customerId, String customerName, String customerLastName, int customerNumber,
			String customerCity) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerLastName = customerLastName;
		this.customerNumber = customerNumber;
		this.customerCity = customerCity;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerLastName="
				+ customerLastName + ", customerNumber=" + customerNumber + ", customerCity=" + customerCity + "]";
	}
	
	
	

}
