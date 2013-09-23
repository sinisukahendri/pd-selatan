package com.pdselatan.dao;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.Salesman;

public interface SalesmanDao extends AbstractDao<Salesman, String> {
	public void saveSalesman(Salesman salesman);
	public void deleteSalesman(Salesman salesman);
    public Salesman findSalesmanById(String salesmanId);
    public List<Salesman> findSalesmansByName(String salesmanName, MatchMode mode);

}
