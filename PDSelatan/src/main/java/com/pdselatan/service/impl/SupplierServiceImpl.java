package com.pdselatan.service.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdselatan.dao.SupplierDao;
import com.pdselatan.model.Supplier;
import com.pdselatan.service.SupplierService;

@Service("supplierService")
@Transactional(readOnly = true)
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	private SupplierDao supplierDao;
	
	@Transactional(readOnly = false)
	public void saveOrUpdateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		supplierDao.saveSupplier(supplier);
	}

	@Transactional(readOnly = false)
	public void deleteSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		supplierDao.deleteSupplier(supplier);
	}

	@Transactional(readOnly = true)
	public Supplier findSupplierById(String supplierId) {
		// TODO Auto-generated method stub
		return supplierDao.findSupplierById(supplierId);
	}

	@Transactional(readOnly = true)
	public List<Supplier> findSuppliersByName(String supplierName,
			MatchMode mode) {
		// TODO Auto-generated method stub
		return supplierDao.findSuppliersByName(supplierName,mode);
	}

}
