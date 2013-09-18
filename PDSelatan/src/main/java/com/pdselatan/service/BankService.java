package com.pdselatan.service;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.Bank;

public interface BankService {
	void saveOrUpdateBank(Bank bank);
	void deleteBank(Bank bank);
	Bank findBankById(String bankId);
	List<Bank> findBanksByName(String bankName, MatchMode mode);
}
