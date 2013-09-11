package com.pdselatan.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value= "/penjualan")
public class PenjualanController {
    
protected static Logger logger = Logger.getLogger(PenjualanController.class);
	private static final String CAT = "penjualan.cat";
	private static final String DATA_PENJUALAN = "penjualan.data-penjualan";
	private static final String KERAMIK = "penjualan.keramik";
	private static final String PPN = "penjualan.ppn";
	private static final String SEKUNDER = "penjualan.sekunder";
	
	
	@RequestMapping("cat")
	public ModelAndView cat(ModelAndView mav){
		mav.setViewName(CAT);						
		return mav;
	}	
	@RequestMapping("data-penjualan")
	public ModelAndView dataPenjualan(ModelAndView mav){
		mav.setViewName(DATA_PENJUALAN);						
		return mav;
	}	
	@RequestMapping("keramik")
	public ModelAndView keramik(ModelAndView mav){
		mav.setViewName(KERAMIK);						
		return mav;
	}	
	@RequestMapping("ppn")
	public ModelAndView ppn(ModelAndView mav){
		mav.setViewName(PPN);						
		return mav;
	}	
	@RequestMapping("sekunder")
	public ModelAndView sekunder(ModelAndView mav){
		mav.setViewName(SEKUNDER);						
		return mav;
	}	

}
