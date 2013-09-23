package com.pdselatan.dao;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.Supplier;

public interface SupplierDao extends AbstractDao<Supplier, String> {
	public void saveSupplier(Supplier supplier);
	public void deleteSupplier(Supplier supplier);
    public Supplier findSupplierById(String supplierId);
    public List<Supplier> findSuppliersByName(String supplierName, MatchMode mode);
}
