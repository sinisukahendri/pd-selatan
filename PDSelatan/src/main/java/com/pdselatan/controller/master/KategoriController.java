package com.pdselatan.controller.master;

import org.apache.log4j.Logger;
import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pdselatan.controller.attribute.BankAttribute;
import com.pdselatan.controller.attribute.KategoriAttribute;
import com.pdselatan.model.Bank;
import com.pdselatan.model.Kategori;
import com.pdselatan.service.KategoriService;

@Controller
@RequestMapping(value = "/master")
public class KategoriController {
	protected static Logger logger = Logger.getLogger(KategoriController.class);

	private static final String KATEGORI = "master.kategori";
	private static final String TAMBAH_KATEGORI = "master.tambah-kategori";

	@Autowired
	private KategoriService kategoriService;
	private KategoriAttribute kategoriForm;

	@RequestMapping("kategori")
	public ModelAndView kategori(ModelAndView mav, KategoriAttribute form) {
		kategoriForm = new KategoriAttribute();

		if (form.getFilter() != null)
			kategoriForm.setKategories(kategoriService.findKategoriesByName(
					form.getFilter(), MatchMode.ANYWHERE));
		else
			kategoriForm.setKategories(kategoriService.findKategoriesByName("",
					MatchMode.ANYWHERE));

		mav.addObject("form", kategoriForm);
		mav.setViewName(KATEGORI);
		return mav;
	}

	@RequestMapping("tambah-kategori")
	public ModelAndView tambahKategori(ModelAndView mav) {
		mav.setViewName(TAMBAH_KATEGORI);
		return mav;
	}

	@RequestMapping("delete-kategori")
	public ModelAndView deleteKategori(ModelAndView mav, KategoriAttribute form) {

		Kategori deletedKategori = new Kategori();
		if (form.getDeletedKategori() != null) {
			deletedKategori.setKategoriId(Integer.parseInt(form
					.getDeletedKategori()));
			// bankService.deleteBank(deletedBank);
			logger.error("Kategori Deleted id:"
					+ deletedKategori.getKategoriId());
		}
		kategoriForm.setKategories(kategoriService.findKategoriesByName("",
				MatchMode.ANYWHERE));
		mav.addObject("form", kategoriForm);
		mav.setViewName(KATEGORI);
		return mav;
	}
}
