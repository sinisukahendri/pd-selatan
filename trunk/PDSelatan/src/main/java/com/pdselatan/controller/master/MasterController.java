package com.pdselatan.controller.master;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value= "/master")
public class MasterController {
    
	protected static Logger logger = Logger.getLogger(MasterController.class);
//mapping
	private static final String BARANG = "master.barang";
	private static final String DATA_BARANG = "master.data-barang";
	private static final String STOCK_BARANG = "master.stock-barang";
	private static final String HARGA_BARANG = "master.harga-barang";
	private static final String GOLONGAN_HARGA = "master.golongan-harga";
	private static final String TAMBAH_GOLONGAN = "master.tambah-golongan";
	
	private static final String PEGAWAI = "master.pegawai";
	private static final String TAMBAH_PEGAWAI = "master.tambah-pegawai";
	
	
		
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
	@RequestMapping("harga-barang")
	public ModelAndView hargaBarang(ModelAndView mav){
		mav.setViewName(HARGA_BARANG);						
		return mav;
	}
	@RequestMapping("golongan-harga")
	public ModelAndView golonganHarga(ModelAndView mav){
		mav.setViewName(GOLONGAN_HARGA);						
		return mav;
	}
	@RequestMapping("tambah-golongan")
	public ModelAndView tambahGolongan(ModelAndView mav){
		mav.setViewName(TAMBAH_GOLONGAN);						
		return mav;
	}
	@RequestMapping("barang")
	public ModelAndView barang(ModelAndView mav){
		mav.setViewName(BARANG);						
		return mav;
	}

	
	@RequestMapping("pegawai")
	public ModelAndView pegawai(ModelAndView mav){
		mav.setViewName(PEGAWAI);						
		return mav;
	}
	@RequestMapping("tambah-pegawai")
	public ModelAndView tambahPegawai(ModelAndView mav){
		mav.setViewName(TAMBAH_PEGAWAI);						
		return mav;
	}
	
	
}
