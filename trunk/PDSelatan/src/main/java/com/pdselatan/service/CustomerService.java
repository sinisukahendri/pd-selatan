package com.pdselatan.service;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.Customer;

public interface CustomerService {
	void saveOrUpdateCustomer(Customer customer);
	void deleteCustomer(Customer customer);
	Customer findCustomerById(String customerId);
	List<Customer> findCustomersByName(String customerName, MatchMode mode);
}
