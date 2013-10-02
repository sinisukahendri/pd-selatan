package com.pdselatan.controller.attribute;

import java.util.List;

import com.pdselatan.model.Customer;

public class CustomerAttribute extends BasePageAttribute{
	private String deletedCustomer;
	private List<Customer> customers;
	private Customer savedCustomer;
	
	public String getDeletedCustomer() {
		return deletedCustomer;
	}
	public void setDeletedCustomer(String deletedCustomer) {
		this.deletedCustomer = deletedCustomer;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public Customer getSavedCustomer() {
		return savedCustomer;
	}
	public void setSavedCustomer(Customer savedCustomer) {
		this.savedCustomer = savedCustomer;
	}
	
	
}
