package com.pdselatan.service.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdselatan.dao.CustomerDao;
import com.pdselatan.model.Customer;
import com.pdselatan.service.CustomerService;

@Service("customerService")
@Transactional(readOnly = true)
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Transactional(readOnly = false)
	public void saveOrUpdateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.saveCustomer(customer);
	}

	@Transactional(readOnly = false)
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.deleteCustomer(customer);
	}
	@Transactional(readOnly = true)
	public Customer findCustomerById(String customerId) {
		// TODO Auto-generated method stub
		return customerDao.findCustomerById(customerId);
	}
	@Transactional(readOnly = true)
	public List<Customer> findCustomersByName(String customerName,
			MatchMode mode) {
		// TODO Auto-generated method stub
		return customerDao.findCustomersByName(customerName,MatchMode.ANYWHERE);
	}

}
