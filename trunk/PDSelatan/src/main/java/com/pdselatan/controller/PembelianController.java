package com.pdselatan.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value= "/pembelian")
public class PembelianController {
    
protected static Logger logger = Logger.getLogger(PembelianController.class);
	private static final String LAPORAN_PEMBELIAN_ITEM = "pembelian.laporan-pembelian-item";
	private static final String LAPORAN_PEMBELIAN = "pembelian.laporan-pembelian";
	private static final String PEMBELIAN_DARI_DO = "pembelian.pembelian-dari-do";
	private static final String PEMBELIAN_LANGSUNG = "pembelian.pembelian-langsung";
	
	
	@RequestMapping("laporan-pembelian-item")
	public ModelAndView laporanPembelianItem(ModelAndView mav){
		mav.setViewName(LAPORAN_PEMBELIAN_ITEM);						
		return mav;
	}	
	@RequestMapping("laporan-pembelian")
	public ModelAndView laporanPembelian(ModelAndView mav){
		mav.setViewName(LAPORAN_PEMBELIAN);						
		return mav;
	}	
	@RequestMapping("pembelian-dari-do")
	public ModelAndView pembelianDariDo(ModelAndView mav){
		mav.setViewName(PEMBELIAN_DARI_DO);						
		return mav;
	}	
	@RequestMapping("pembelian-langsung")
	public ModelAndView pembelianLangsung(ModelAndView mav){
		mav.setViewName(PEMBELIAN_LANGSUNG);						
		return mav;
	}	

}
