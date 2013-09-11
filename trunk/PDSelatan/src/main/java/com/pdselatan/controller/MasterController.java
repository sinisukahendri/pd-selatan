package com.pdselatan.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value= "/master")
public class MasterController {
    
protected static Logger logger = Logger.getLogger(MasterController.class);
	private static final String BANK = "master.bank";
	private static final String BARANG = "master.barang";
	private static final String CUSTOMER = "master.customer";
	private static final String PEGAWAI = "master.pegawai";
	private static final String SALES = "master.sales";
	private static final String SUPPLIER = "master.supplier";
	
	@RequestMapping("bank")
	public ModelAndView bank(ModelAndView mav){
		mav.setViewName(BANK);						
		return mav;
	}	
	@RequestMapping("barang")
	public ModelAndView barang(ModelAndView mav){
		mav.setViewName(BARANG);						
		return mav;
	}	
	@RequestMapping("customer")
	public ModelAndView customer(ModelAndView mav){
		mav.setViewName(CUSTOMER);						
		return mav;
	}	
	@RequestMapping("pegawai")
	public ModelAndView pegawai(ModelAndView mav){
		mav.setViewName(PEGAWAI);						
		return mav;
	}	
	@RequestMapping("sales")
	public ModelAndView sales(ModelAndView mav){
		mav.setViewName(SALES);						
		return mav;
	}	
	@RequestMapping("supplier")
	public ModelAndView supplier(ModelAndView mav){
		mav.setViewName(SUPPLIER);						
		return mav;
	}	

}
