package com.pdselatan.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value= "/pembayaran")
public class PembayaranController {
    
protected static Logger logger = Logger.getLogger(PembayaranController.class);
	private static final String DATA_PEMBELIAN = "pembayaran.data-pembelian";
	private static final String DATA_PENJUALAN = "pembayaran.data-penjualan";
	private static final String PEMBELIAN = "pembayaran.pembelian";
	private static final String PENJUALAN= "pembayaran.penjualan";

	@RequestMapping("data-pembelian")
	public ModelAndView dataPembelian(ModelAndView mav){
		mav.setViewName(DATA_PEMBELIAN);						
		return mav;
	}	
	@RequestMapping("data-penjualan")
	public ModelAndView dataPenjualan(ModelAndView mav){
		mav.setViewName(DATA_PENJUALAN);						
		return mav;
	}	
	@RequestMapping("pembelian")
	public ModelAndView pembelian(ModelAndView mav){
		mav.setViewName(PEMBELIAN);						
		return mav;
	}	
	@RequestMapping("penjualan")
	public ModelAndView penjualan(ModelAndView mav){
		mav.setViewName(PENJUALAN);						
		return mav;
	}	

}
