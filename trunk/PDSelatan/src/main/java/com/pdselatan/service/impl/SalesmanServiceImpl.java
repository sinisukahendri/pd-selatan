package com.pdselatan.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdselatan.dao.SalesmanDao;
import com.pdselatan.model.Salesman;
import com.pdselatan.service.SalesmanService;

@Service("salesmanService")
@Transactional(readOnly = true)
public class SalesmanServiceImpl implements SalesmanService {
	
	@Autowired
	private SalesmanDao salesmanDao;
	Logger logger = Logger.getLogger(BankServiceImpl.class);
	
	@Transactional(readOnly =false)
	public void saveOrUpdateSalesman(Salesman salesman) {
		// TODO Auto-generated method stub
		salesmanDao.saveSalesman(salesman);
	}
	@Transactional(readOnly =false)
	public void deleteSalesman(Salesman salesman) {
		// TODO Auto-generated method stub
		salesmanDao.deleteSalesman(salesman);
	}
	@Transactional(readOnly =true)
	public Salesman findSalesmanById(String salesmanId) {
		// TODO Auto-generated method stub
		return salesmanDao.findSalesmanById(salesmanId);
	}
	@Transactional(readOnly =true)
	public List<Salesman> findSalesmansByName(String salesmanName,
			MatchMode mode) {
		// TODO Auto-generated method stub
		return salesmanDao.findSalesmansByName(salesmanName, mode);
	}
}
