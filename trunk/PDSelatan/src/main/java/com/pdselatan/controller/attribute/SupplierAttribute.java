package com.pdselatan.controller.attribute;

import java.util.List;

import com.pdselatan.model.Supplier;


public class SupplierAttribute extends BasePageAttribute{
	private List<Supplier> suppliers;
	private String deletedSupplier;
	private Supplier savedSupplier;
	
	public List<Supplier> getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}
	public String getDeletedSupplier() {
		return deletedSupplier;
	}
	public void setDeletedSupplier(String deletedSupplier) {
		this.deletedSupplier = deletedSupplier;
	}
	public Supplier getSavedSupplier() {
		return savedSupplier;
	}
	public void setSavedSupplier(Supplier savedSupplier) {
		this.savedSupplier = savedSupplier;
	}
}
