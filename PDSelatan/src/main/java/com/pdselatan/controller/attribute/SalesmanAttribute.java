package com.pdselatan.controller.attribute;

import java.util.List;

import com.pdselatan.model.Salesman;

public class SalesmanAttribute extends BasePageAttribute {
	
	private List<Salesman> salesmans;
	private String deletedSalesman;
	private Salesman savedSalesman;
	
	public List<Salesman> getSalesmans() {
		return salesmans;
	}
	public void setSalesmans(List<Salesman> salesmans) {
		this.salesmans = salesmans;
	}
	public String getDeletedSalesman() {
		return deletedSalesman;
	}
	public void setDeletedSalesman(String deletedSalesman) {
		this.deletedSalesman = deletedSalesman;
	}
	public Salesman getSavedSalesman() {
		return savedSalesman;
	}
	public void setSavedSalesman(Salesman savedSalesman) {
		this.savedSalesman = savedSalesman;
	}
}
