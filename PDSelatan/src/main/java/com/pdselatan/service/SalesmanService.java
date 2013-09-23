package com.pdselatan.service;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.Salesman;

public interface SalesmanService {
	void saveOrUpdateSalesman(Salesman salesman);
	void deleteSalesman(Salesman salesman);
	Salesman findSalesmanById(String salesmanId);
	List<Salesman> findSalesmansByName(String salesmanName, MatchMode mode);
}
