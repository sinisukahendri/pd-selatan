package com.pdselatan.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdselatan.dao.impl.BankDaoImpl;
import com.pdselatan.model.Bank;
import com.pdselatan.service.BankService;

@Service("bankService")
@Transactional(readOnly = true)
public class BankServiceImpl implements BankService {

	@Autowired
	private BankDaoImpl bankDao;
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

	public Bank findBankById(String bankId) {
		// TODO Auto-generated method stub
		return bankDao.findBankById(bankId);
	}

	public List<Bank> findBanksByName(String bankName,MatchMode mode) {
		// TODO Auto-generated method stub
		logger.error(bankDao);
		return bankDao.findBanksByName(bankName, mode);
	}
}
