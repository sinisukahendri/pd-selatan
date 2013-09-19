package com.pdselatan.controller.attribute;

import java.util.List;

import com.pdselatan.model.Bank;

public class BankAttribute extends BasePageAttribute {

	private List<Bank> banks;
	private String deletedBank;
	private Bank savedBank;
	
	public List<Bank> getBanks() {
		return banks;
	}

	public void setBanks(List<Bank> banks) {
		this.banks = banks;
	}

	public String getDeletedBank() {
		return deletedBank;
	}

	public void setDeletedBank(String deletedBank) {
		this.deletedBank = deletedBank;
	}

	public Bank getSavedBank() {
		return savedBank;
	}

	public void setSavedBank(Bank savedBank) {
		this.savedBank = savedBank;
	}

}
