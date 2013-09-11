/**
 * 
 */
package com.pdselatan.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value= "/laporan")
public class LaporanController {
        
	protected static Logger logger = Logger.getLogger(LaporanController.class);
	private static final String LAPORAN_BANK = "laporan.laporan-bank";
	private static final String LAPORAN_DO = "laporan.laporan-do";
	private static final String LAPORAN_FAKTUR_BELUM_LUNAS = "laporan.laporan-faktur-belum-lunas";
	private static final String LAPORAN_GIRO_BELUM_CAIR = "laporan.laporan-giro-belum-cair";
	private static final String LAPORAN_HUTANG = "laporan.laporan-hutang";
	private static final String LAPORAN_OMSET_TAHUNAN = "laporan.laporan-omset-tahunan";
	private static final String LAPORAN_OMSET = "laporan.laporan-omset";
	private static final String LAPORAN_PENJUALAN_BK = "laporan.laporan-penjualan-bk";
	private static final String LAPORAN_PENJUALAN_FULL = "laporan.laporan-penjualan-full";
	private static final String LAPORAN_PENJUALAN_SEKUNDER = "laporan.laporan-penjualan-sekunder";
	private static final String LAPORAN_PENJUALAN = "laporan.laporan-penjualan";
	private static final String LAPORAN_PIUTANG = "laporan.laporan-piutang";
	private static final String LAPORAN_RETUR_BELUM_DIBAYAR = "laporan.laporan-retur-belum-dibayar";
	private static final String LAPORAN_TRANSFER = "laporan.laporan-transfer";

	@RequestMapping("laporan-bank")
	public ModelAndView laporanBank(ModelAndView mav){
		mav.setViewName(LAPORAN_BANK);					
		return mav;
	}	
	@RequestMapping("laporan-do")
	public ModelAndView laporanDo(ModelAndView mav){
		mav.setViewName(LAPORAN_DO);					
		return mav;
	}	
	@RequestMapping("laporan-faktur-belum-lunas")
	public ModelAndView laporanFakturBelumLunas(ModelAndView mav){
		mav.setViewName(LAPORAN_FAKTUR_BELUM_LUNAS);					
		return mav;
	}
	@RequestMapping("laporan-giro-belum-cair")
	public ModelAndView laporanGiroBelumCair(ModelAndView mav){
		mav.setViewName(LAPORAN_GIRO_BELUM_CAIR);					
		return mav;
	}	
	@RequestMapping("laporan-hutang")
	public ModelAndView laporanHutang(ModelAndView mav){
		mav.setViewName(LAPORAN_HUTANG);					
		return mav;
	}	
	@RequestMapping("laporan-omset-tahunan")
	public ModelAndView laporanOmsetTahunan(ModelAndView mav){
		mav.setViewName(LAPORAN_OMSET_TAHUNAN);					
		return mav;
	}	
	@RequestMapping("laporan-omset")
	public ModelAndView laporanOmset(ModelAndView mav){
		mav.setViewName(LAPORAN_OMSET);					
		return mav;
	}	
	@RequestMapping("laporan-penjualan-bk")
	public ModelAndView laporanPenjualanBK(ModelAndView mav){
		mav.setViewName(LAPORAN_PENJUALAN_BK);					
		return mav;
	}	
	@RequestMapping("laporan-penjualan-full")
	public ModelAndView laporanPenjualanFull(ModelAndView mav){
		mav.setViewName(LAPORAN_PENJUALAN_FULL);					
		return mav;
	}	
	@RequestMapping("laporan-penjualan-sekunder")
	public ModelAndView laporanPenjualanSekunder(ModelAndView mav){
		mav.setViewName(LAPORAN_PENJUALAN_SEKUNDER);					
		return mav;
	}	
	@RequestMapping("laporan-penjualan")
	public ModelAndView laporanPenjualan(ModelAndView mav){
		mav.setViewName(LAPORAN_PENJUALAN);					
		return mav;
	}	
	@RequestMapping("laporan-piutang")
	public ModelAndView laporanPiutang(ModelAndView mav){
		mav.setViewName(LAPORAN_PIUTANG);					
		return mav;
	}	
	@RequestMapping("laporan-retur-belum-dibayar")
	public ModelAndView laporanReturBelumDibayar(ModelAndView mav){
		mav.setViewName(LAPORAN_RETUR_BELUM_DIBAYAR);					
		return mav;
	}	
	@RequestMapping("laporan-transfer")
	public ModelAndView laporanTramsfer(ModelAndView mav){
		mav.setViewName(LAPORAN_TRANSFER);					
		return mav;
	}	
}