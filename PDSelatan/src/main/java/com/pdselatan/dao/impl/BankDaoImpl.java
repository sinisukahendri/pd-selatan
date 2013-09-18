package com.pdselatan.dao.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.pdselatan.dao.BankDao;
import com.pdselatan.model.Bank;

@Repository
public class BankDaoImpl extends AbstractDaoImpl<Bank,String> implements BankDao {
	
	protected BankDaoImpl(){
		super(Bank.class);
	}
	
    public void saveBank(Bank bank) {
        saveOrUpdate(bank);
    }
    
    public void deleteBank(Bank bank) {
        delete(bank);
    }

    public List<Bank> findBanksByName(String bankName, MatchMode mode) {    	
        return findByCriteria(Restrictions.like("bank_name", bankName, mode));
    }        
    
    public Bank findBankById(String bankId) {
        return findById(bankId);
    }
}
