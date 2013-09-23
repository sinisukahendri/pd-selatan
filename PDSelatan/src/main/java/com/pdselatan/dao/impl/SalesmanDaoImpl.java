package com.pdselatan.dao.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.pdselatan.dao.SalesmanDao;
import com.pdselatan.model.Salesman;

@Repository
public class SalesmanDaoImpl extends AbstractDaoImpl<Salesman, String> implements
		SalesmanDao {
	
	protected SalesmanDaoImpl(){
		super(Salesman.class);
	}

	public void saveSalesman(Salesman salesman) {
		// TODO Auto-generated method stub
		saveOrUpdate(salesman);
	}

	public void deleteSalesman(Salesman salesman) {
		// TODO Auto-generated method stub
		delete(salesman);
	}

	public Salesman findSalesmanById(String salesmanId) {
		// TODO Auto-generated method stub
		return findById(salesmanId);
	}

	public List<Salesman> findSalesmansByName(String salesmanName,
			MatchMode mode) {
		// TODO Auto-generated method stub
		return findByCriteria(Restrictions.like("salesmanName",salesmanName,mode));
	}
	
	
}
