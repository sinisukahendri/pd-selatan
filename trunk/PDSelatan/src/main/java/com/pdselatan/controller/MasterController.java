package com.pdselatan.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.criterion.MatchMode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pdselatan.model.Bank;
import com.pdselatan.service.impl.BankServiceImpl;

@Controller
@RequestMapping(value= "/master")
public class MasterController {
    
	protected static Logger logger = Logger.getLogger(MasterController.class);
//mapping
	private static final String BANK = "master.bank";
	private static final String TAMBAH_BANK = "master.tambah-bank";
	private static final String BARANG = "master.barang";
	private static final String DATA_BARANG = "master.data-barang";
	private static final String STOCK_BARANG = "master.stock-barang";
	private static final String HARGA_BARANG = "master.harga-barang";
	private static final String GOLONGAN_HARGA = "master.golongan-harga";
	private static final String TAMBAH_GOLONGAN = "master.tambah-golongan";
	private static final String KATEGORI = "master.kategori";
	private static final String TAMBAH_KATEGORI = "master.tambah-kategori";
	private static final String CUSTOMER = "master.customer";
	private static final String TAMBAH_CUSTOMER = "master.tambah-customer";
	private static final String PEGAWAI = "master.pegawai";
	private static final String TAMBAH_PEGAWAI = "master.tambah-pegawai";
	private static final String SALES = "master.sales";
	private static final String TAMBAH_SALES = "master.tambah-sales";
	private static final String SUPPLIER = "master.supplier";
	private static final String TAMBAH_SUPPLIER = "master.tambah-pegawai";
	
	@RequestMapping("bank")
	public ModelAndView bank(ModelAndView mav){
		mav.setViewName(BANK);						
		return mav;
	}
	@RequestMapping("tambah-bank")
	public ModelAndView tambah_bank(ModelAndView mav){
		mav.setViewName(TAMBAH_BANK);						
		return mav;
	}	
	@RequestMapping("data-barang")
	public ModelAndView data_barang(ModelAndView mav){
		mav.setViewName(DATA_BARANG);						
		return mav;
	}
	@RequestMapping("stock-barang")
	public ModelAndView stock_barang(ModelAndView mav){
		mav.setViewName(STOCK_BARANG);						
		return mav;
	}
	@RequestMapping("harga-barang")
	public ModelAndView harga_barang(ModelAndView mav){
		mav.setViewName(HARGA_BARANG);						
		return mav;
	}
	@RequestMapping("golongan-harga")
	public ModelAndView golongan_harga(ModelAndView mav){
		mav.setViewName(GOLONGAN_HARGA);						
		return mav;
	}
	@RequestMapping("tambah-golongan")
	public ModelAndView tambah_golongan(ModelAndView mav){
		mav.setViewName(TAMBAH_GOLONGAN);						
		return mav;
	}
	@RequestMapping("barang")
	public ModelAndView barang(ModelAndView mav){
		mav.setViewName(BARANG);						
		return mav;
	}
	@RequestMapping("kategori")
	public ModelAndView kategori(ModelAndView mav){
		mav.setViewName(KATEGORI);						
		return mav;
	}
	@RequestMapping("tambah-kategori")
	public ModelAndView TAMBAH_KATEGORI(ModelAndView mav){
		mav.setViewName(TAMBAH_KATEGORI);						
		return mav;
	}
	@RequestMapping("customer")
	public ModelAndView customer(ModelAndView mav){
		mav.setViewName(CUSTOMER);						
		return mav;
	}	
	@RequestMapping("tambah-customer")
	public ModelAndView tambah_customer(ModelAndView mav){
		mav.setViewName(TAMBAH_CUSTOMER);						
		return mav;
	}	
	@RequestMapping("pegawai")
	public ModelAndView pegawai(ModelAndView mav){
		mav.setViewName(PEGAWAI);						
		return mav;
	}
	@RequestMapping("tambah-pegawai")
	public ModelAndView tambah_pegawai(ModelAndView mav){
		mav.setViewName(TAMBAH_PEGAWAI);						
		return mav;
	}
	@RequestMapping("sales")
	public ModelAndView sales(ModelAndView mav){
		mav.setViewName(SALES);						
		return mav;
	}	
	@RequestMapping("tambah-sales")
	public ModelAndView tambah_sales(ModelAndView mav){
		mav.setViewName(TAMBAH_SALES);						
		return mav;
	}
	@RequestMapping("supplier")
	public ModelAndView supplier(ModelAndView mav){
		mav.setViewName(SUPPLIER);						
		return mav;
	}	
	@RequestMapping("tambah-supplier")
	public ModelAndView tambah_supplier(ModelAndView mav){
		mav.setViewName(TAMBAH_SUPPLIER);						
		return mav;
	}
	
	
	BankServiceImpl bankService = new BankServiceImpl();
//method2
	public void addBank(Bank bank){
		bankService.saveOrUpdateBank(bank);
	}
	
	public void updateBank(Bank bank){
		bankService.saveOrUpdateBank(bank);
	}
	
	public void deleteBank(String bankId){
		Bank bank = bankService.findBankById(bankId);
		bankService.deleteBank(bank);
	}
	
	public List<Bank> getAllBank(){
		return bankService.findBanksByName(" ",MatchMode.ANYWHERE);
	}
	
	public List<Bank> getBanksByBame(String bankName){
		return bankService.findBanksByName(bankName,MatchMode.ANYWHERE);
	}
}
