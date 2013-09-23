package com.pdselatan.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdselatan.dao.BankDao;
import com.pdselatan.model.Bank;
import com.pdselatan.service.BankService;

@Service("bankService")
@Transactional(readOnly = true)
public class BankServiceImpl implements BankService {

	@Autowired
	private BankDao bankDao;
	Logger logger = Logger.getLogger(BankServiceImpl.class);
	
	@Transactional(readOnly = false)
	public void saveOrUpdateBank(Bank bank) {
		// TODO Auto-generated method stub
		bankDao.saveBank(bank);
	}

	@Transactional(readOnly = false)
	public void deleteBank(Bank bank) {
		// TODO Auto-generated method stub
		bankDao.deleteBank(bank);
	}

	@Transactional(readOnly = true)
	public Bank findBankById(String bankId) {
		// TODO Auto-generated method stub
		return bankDao.findBankById(bankId);
	}

	@Transactional(readOnly = true)
	public List<Bank> findBanksByName(String bankName,MatchMode mode) {
		// TODO Auto-generated method stub
		return bankDao.findBanksByName(bankName, mode);
	}
}
