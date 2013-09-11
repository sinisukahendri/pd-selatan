package com.pdselatan.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value= "/operasional")
public class OperasionalController {
    
protected static Logger logger = Logger.getLogger(OperasionalController.class);
	private static final String DATA_KAS_KECIL = "operasional.data-kas-kecil";
	private static final String TAMBAH_KAS_KECIL = "operasional.tambah-kas-kecil";
	private static final String DATA_OPERATIONAL = "operasional.data-operational";
	private static final String TAMBAH_OPERATIONAL = "operasional.tambah-operational";
	
	@RequestMapping("data-kas-kecil")
	public ModelAndView dataKasKecil(ModelAndView mav){
		mav.setViewName(DATA_KAS_KECIL);						
		return mav;
	}	
	@RequestMapping("tambah-kas-kecil")
	public ModelAndView tambahKasKecil(ModelAndView mav){
		mav.setViewName(TAMBAH_KAS_KECIL);						
		return mav;
	}	
	@RequestMapping("data-operational")
	public ModelAndView dataOperational(ModelAndView mav){
		mav.setViewName(DATA_OPERATIONAL);						
		return mav;
	}	
	@RequestMapping("tambah-operational")
	public ModelAndView tambahOperational(ModelAndView mav){
		mav.setViewName(TAMBAH_OPERATIONAL);						
		return mav;
	}	

}
