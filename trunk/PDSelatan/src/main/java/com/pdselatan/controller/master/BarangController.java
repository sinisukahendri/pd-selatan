package com.pdselatan.controller.master;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value= "/master")
public class BarangController {
    
	protected static Logger logger = Logger.getLogger(BarangController.class);
//mapping
	private static final String BARANG = "master.barang";
	private static final String DATA_BARANG = "master.data-barang";
	private static final String STOCK_BARANG = "master.stock-barang";
	
		
	@RequestMapping("data-barang")
	public ModelAndView dataBarang(ModelAndView mav){
		mav.setViewName(DATA_BARANG);						
		return mav;
	}
	@RequestMapping("stock-barang")
	public ModelAndView stockBarang(ModelAndView mav){
		mav.setViewName(STOCK_BARANG);						
		return mav;
	}
	@RequestMapping("barang")
	public ModelAndView barang(ModelAndView mav){
		mav.setViewName(BARANG);						
		return mav;
	}
	
}
