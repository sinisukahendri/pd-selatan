package com.pdselatan.controller.master;

import org.apache.log4j.Logger;
import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pdselatan.controller.attribute.CustomerAttribute;
import com.pdselatan.model.Customer;
import com.pdselatan.service.CustomerService;

@Controller
@RequestMapping(value= "/master")
public class CustomerController {
	protected static Logger logger = Logger.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerService customerService;
	private CustomerAttribute customerForm;
	
	private static final String CUSTOMER = "master.customer";
	private static final String TAMBAH_CUSTOMER = "master.tambah-customer";
	
	@RequestMapping("customer")
	public ModelAndView customer(ModelAndView mav, CustomerAttribute form){
		customerForm = new CustomerAttribute();
		if(form.getFilter()!=null)
			customerForm.setCustomers(customerService.findCustomersByName(form.getFilter(),MatchMode.ANYWHERE));
		else
			customerForm.setCustomers(customerService.findCustomersByName("",MatchMode.ANYWHERE));
		
		mav.addObject("form",customerForm);
		mav.setViewName(CUSTOMER);						
		return mav;
	}	
	@RequestMapping("tambah-customer")
	public ModelAndView tambahCustomer(ModelAndView mav, CustomerAttribute form){
		Customer savedCustomer = new Customer();
		if(form.getSavedCustomer()!=null){
			savedCustomer =  form.getSavedCustomer();
			customerService.saveOrUpdateCustomer(savedCustomer);
		}
		mav.setViewName(TAMBAH_CUSTOMER);						
		return mav;
	}
	@RequestMapping("delete-customer")
	public ModelAndView deleteCustomer(ModelAndView mav, CustomerAttribute form){
		Customer deletedCustomer = new Customer();
		if(form.getDeletedCustomer()!=null){
			deletedCustomer.setCustomerId(Integer.parseInt(form.getDeletedCustomer()));
//			customerService.deleteCustomer(deletedCustomer);
			logger.error("Customer deleted, id"+deletedCustomer.getCustomerId());
		}
		customerForm.setCustomers(customerService.findCustomersByName("",MatchMode.ANYWHERE));
		
		mav.setViewName(CUSTOMER);
		return mav;
	}
}
