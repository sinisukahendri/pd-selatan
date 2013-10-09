package com.pdselatan.controller.master;

import org.apache.log4j.Logger;
import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pdselatan.controller.attribute.HargaBarangAttribute;
import com.pdselatan.model.HargaBarang;
import com.pdselatan.service.HargaBarangService;
import com.pdselatan.service.KategoriService;

@Controller
@RequestMapping(value= "/master")
public class HargaBarangController {
	protected static Logger logger = Logger.getLogger(HargaBarangController.class);
	
	@Autowired
	private HargaBarangService hargaBarangService;
	@Autowired
	private KategoriService kategoriService;
	
	private HargaBarangAttribute hargaBarangForm;
	
	private static final String HARGA_BARANG = "master.harga-barang";
	private static final String GOLONGAN_HARGA = "master.golongan-harga";
	private static final String TAMBAH_GOLONGAN = "master.tambah-golongan";
	
	@RequestMapping("harga-barang")
	public ModelAndView hargaBarang(ModelAndView mav){
		mav.setViewName(HARGA_BARANG);						
		return mav;
	}
	@RequestMapping("golongan-harga")
	public ModelAndView golonganHarga(ModelAndView mav, HargaBarangAttribute form){
		hargaBarangForm = new HargaBarangAttribute();
		if(form.getKategories()==null){
			hargaBarangForm.setKategories(kategoriService.findKategoriesByName("",MatchMode.ANYWHERE));
		}
		
		hargaBarangForm.setHargaBarangs(hargaBarangService.findHargaBarangByKategory(form.getFilter()));
		
		mav.addObject("form",hargaBarangForm);
		mav.setViewName(GOLONGAN_HARGA);						
		return mav;
	}
	
	@RequestMapping("tambah-golongan")
	public ModelAndView tambahGolongan(ModelAndView mav, HargaBarangAttribute form){
		HargaBarang savedHargaBarang = new HargaBarang();
		if(form.getSavedHargaBarang()!=null){
			savedHargaBarang = form.getSavedHargaBarang();
			hargaBarangService.saveHargaBarang(savedHargaBarang);
		}
		mav.setViewName(TAMBAH_GOLONGAN);						
		return mav;
	}
	@RequestMapping("delete-hargaBarang")
	public ModelAndView deleteHargaBarang(ModelAndView mav, HargaBarangAttribute form){
		HargaBarang deletedHargaBarang = new HargaBarang();
		if(form.getDeletedHargaBarang()!=null){
			deletedHargaBarang.setPriceId(Integer.parseInt(form.getDeletedHargaBarang()));
//			hargaBarangService.deleteHargaBarang(deletedHargaBarang);
			logger.error("harga barang delete :"+deletedHargaBarang.getPriceId());
		}
		String filter = "";
		if(form.getFilter()!=null)
			filter = form.getFilter();
		
		hargaBarangForm.setHargaBarangs(hargaBarangService.findHargaBarangByKategory(filter));
		return mav;
	}
}
