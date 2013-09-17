package com.pdselatan.dao;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.Bank;

public interface BankDao extends AbstractDao<Bank, String>{
	public void saveBank(Bank bank);
	public void deleteBank(Bank bank);
    public Bank findBankById(String bankId);
    public List<Bank> findBanksByName(String bankName, MatchMode mode);
}
