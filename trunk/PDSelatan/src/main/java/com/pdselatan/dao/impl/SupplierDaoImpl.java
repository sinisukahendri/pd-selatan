package com.pdselatan.dao.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.pdselatan.dao.SupplierDao;
import com.pdselatan.model.Supplier;

@Repository
public class SupplierDaoImpl extends AbstractDaoImpl<Supplier, String> implements
		SupplierDao {

	protected SupplierDaoImpl() {
		super(Supplier.class);
		// TODO Auto-generated constructor stub
	}

	public void saveSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		saveSupplier(supplier);
	}

	public void deleteSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		deleteSupplier(supplier);
	}

	public Supplier findSupplierById(String supplierId) {
		// TODO Auto-generated method stub
		return findSupplierById(supplierId);
	}

	public List<Supplier> findSuppliersByName(String supplierName,
			MatchMode mode) {
		// TODO Auto-generated method stub
		return findByCriteria(Restrictions.like("supplierName", supplierName,mode));
	}

}
