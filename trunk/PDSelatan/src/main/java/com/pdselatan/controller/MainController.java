package com.pdselatan.controller;

import org.apache.log4j.Logger;
import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pdselatan.controller.attribute.BasePageAttribute;
import com.pdselatan.service.BankService;
import com.pdselatan.service.UserService;

@Controller
public class MainController {

	protected static Logger logger = Logger.getLogger(MainController.class);
	private static final String INDEX_PAGE = "index";
	
	@Autowired
    private BankService bankService;
	
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName(INDEX_PAGE);
		mav.addObject("test", "TESTING 2");
		bankService.findBanksByName("MAP/SAP", MatchMode.EXACT);
		return mav;
	}

}
