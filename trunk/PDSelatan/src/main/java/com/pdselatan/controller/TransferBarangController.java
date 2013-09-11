package com.pdselatan.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value= "/transfer-barang")
public class TransferBarangController {
    
protected static Logger logger = Logger.getLogger(TransferBarangController.class);
	private static final String TRANSFER_BARANG = "transfer-barang.transfer-barang";
	
	@RequestMapping("transfer-barang")
	public ModelAndView transferBarang(ModelAndView mav){
		mav.setViewName(TRANSFER_BARANG);						
		return mav;
	}		

}
