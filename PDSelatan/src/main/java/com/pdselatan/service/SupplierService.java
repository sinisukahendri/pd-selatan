package com.pdselatan.service;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.Supplier;

public interface SupplierService {
	void saveOrUpdateSupplier(Supplier supplier);
	void deleteSupplier(Supplier supplier);
	Supplier findSupplierById(String supplierId);
	List<Supplier> findSuppliersByName(String supplierName, MatchMode mode);
}
