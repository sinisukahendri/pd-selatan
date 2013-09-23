package com.pdselatan.controller.master;

import org.apache.log4j.Logger;
import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pdselatan.controller.attribute.BankAttribute;
import com.pdselatan.model.Bank;
import com.pdselatan.service.BankService;

@Controller
@RequestMapping(value= "/master")
public class BankController {
	protected static Logger logger = Logger.getLogger(BankController.class);
	
	private static final String BANK = "master.bank";
	private static final String TAMBAH_BANK = "master.tambah-bank";
	
	@Autowired
	private BankService bankService;
	private BankAttribute savedForm;
	
	@RequestMapping("bank")
	public ModelAndView bank(ModelAndView mav, BankAttribute form){
		savedForm = new BankAttribute();
		if(form.getFilter()!=null)
			savedForm.setBanks(bankService.findBanksByName(form.getFilter(),MatchMode.ANYWHERE));
		else
			savedForm.setBanks(bankService.findBanksByName("",MatchMode.ANYWHERE));
			
		mav.addObject("form",savedForm);
		mav.setViewName(BANK);						
		return mav;
	}
	
	@RequestMapping("tambah-bank")
	public ModelAndView tambahBank(ModelAndView mav, BankAttribute form){
		Bank savedBank = new Bank();
		if(form.getSavedBank()!=null){
			savedBank = form.getSavedBank();
			bankService.saveOrUpdateBank(savedBank);
		}
		mav.setViewName(TAMBAH_BANK);						
		return mav;
	}
	
	@RequestMapping("delete-bank")
	public ModelAndView deleteBank(ModelAndView mav, BankAttribute form){
		
		Bank deletedBank = new Bank();
		if(form.getDeletedBank()!=null){
			deletedBank.setBankId(Double.parseDouble(form.getDeletedBank()));
	//		bankService.deleteBank(deletedBank);
			logger.error("Bank Deleted id:"+deletedBank.getBankId());
		}
		savedForm.setBanks(bankService.findBanksByName("",MatchMode.ANYWHERE));
		mav.addObject("form",savedForm);
		mav.setViewName(BANK);						
		return mav;
	}
}
