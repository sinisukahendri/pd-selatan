package com.pdselatan.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value= "/retur")
public class ReturController {
    
protected static Logger logger = Logger.getLogger(ReturController.class);
	private static final String RETUR = "retur.retur";
	
	@RequestMapping("retur")
	public ModelAndView retur(ModelAndView mav){
		mav.setViewName(RETUR);						
		return mav;
	}	

}
