package com.pdselatan.dao;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.Customer;

public interface CustomerDao extends AbstractDao<Customer,String> {
	public void saveCustomer(Customer customer);
	public void deleteCustomer(Customer customer);
    public Customer findCustomerById(String customerId);
    public List<Customer> findCustomersByName(String customerName, MatchMode mode);
}
