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
	private static final String CUSTOMER = "master.customer";
	private static final String TAMBAH_CUSTOMER = "master.tambah-customer";
	private static final String PEGAWAI = "master.pegawai";
	private static final String TAMBAH_PEGAWAI = "master.tambah-pegawai";
	private static final String SALES = "master.sales";
	private static final String TAMBAH_SALES = "master.tambah-sales";
	private static final String SUPPLIER = "master.supplier";
	private static final String TAMBAH_SUPPLIER = "master.tambah-pegawai";
	
		
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
	
	@RequestMapping("customer")
	public ModelAndView customer(ModelAndView mav){
		mav.setViewName(CUSTOMER);						
		return mav;
	}	
	@RequestMapping("tambah-customer")
	public ModelAndView tambahCustomer(ModelAndView mav){
		mav.setViewName(TAMBAH_CUSTOMER);						
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
	@RequestMapping("sales")
	public ModelAndView sales(ModelAndView mav){
		mav.setViewName(SALES);						
		return mav;
	}	
	@RequestMapping("tambah-sales")
	public ModelAndView tambahSales(ModelAndView mav){
		mav.setViewName(TAMBAH_SALES);						
		return mav;
	}
	@RequestMapping("supplier")
	public ModelAndView supplier(ModelAndView mav){
		mav.setViewName(SUPPLIER);						
		return mav;
	}	
	@RequestMapping("tambah-supplier")
	public ModelAndView tambahSupplier(ModelAndView mav){
		mav.setViewName(TAMBAH_SUPPLIER);						
		return mav;
	}
}
