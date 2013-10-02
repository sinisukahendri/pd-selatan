package com.pdselatan.dao.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.pdselatan.dao.CustomerDao;
import com.pdselatan.model.Customer;

@Repository
public class CustomerDaoImpl extends AbstractDaoImpl<Customer,String> implements
		CustomerDao {
	protected CustomerDaoImpl(){
		super(Customer.class);
	}

	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		saveOrUpdate(customer);
	}

	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		deleteCustomer(customer);
	}

	public Customer findCustomerById(String customerId) {
		// TODO Auto-generated method stub
		return findById(customerId);
	}

	public List<Customer> findCustomersByName(String customerName,
			MatchMode mode) {
		// TODO Auto-generated method stub
		return findByCriteria(Restrictions.like("customerName",customerName,mode));
	}
	
}
