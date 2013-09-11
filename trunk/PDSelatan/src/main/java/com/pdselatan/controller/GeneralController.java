/**
 * 
 */
package com.pdselatan.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value= "/general")
public class GeneralController {
        
	protected static Logger logger = Logger.getLogger(GeneralController.class);
	private static final String LOGIN_PAGE = "general/login.jsp";
	
	@RequestMapping("/login")
	public ModelAndView login(ModelAndView mav){
		mav.setViewName(LOGIN_PAGE);					
		return mav;
	}	
	
}