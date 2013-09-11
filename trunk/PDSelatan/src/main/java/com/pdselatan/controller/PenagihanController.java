package com.pdselatan.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value= "/penagihan")
public class PenagihanController {
    
protected static Logger logger = Logger.getLogger(PenagihanController.class);
	private static final String PENAGIHAN = "penagihan.penagihan";
	private static final String TAMBAH_DATA = "penagihan.tambah-data";
		
	@RequestMapping("penagihan")
	public ModelAndView penagihan(ModelAndView mav){
		mav.setViewName(PENAGIHAN);						
		return mav;
	}	
	@RequestMapping("tambah-data")
	public ModelAndView tambahData(ModelAndView mav){
		mav.setViewName(TAMBAH_DATA);						
		return mav;
	}	

}
