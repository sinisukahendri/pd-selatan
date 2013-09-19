package com.pdselatan.service.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdselatan.dao.KategoriDao;
import com.pdselatan.model.Kategori;
import com.pdselatan.service.KategoriService;

@Service("kategoriService")
@Transactional(readOnly = true)
public class KategoriServiceImpl implements KategoriService{

	@Autowired
	private KategoriDao kategoriDao;
	
	@Transactional(readOnly = false)
	public void saveOrUpdateKategori(Kategori kategori) {
		// TODO Auto-generated method stub
		kategoriDao.saveKategori(kategori);
	}

	@Transactional(readOnly = false)
	public void deleteKategori(Kategori kategori) {
		// TODO Auto-generated method stub
		kategoriDao.deleteKategori(kategori);
	}

	@Transactional(readOnly = true)
	public Kategori findKategoriById(String kategoriId) {
		// TODO Auto-generated method stub
		return kategoriDao.findKategoriById(kategoriId);
	}

	@Transactional(readOnly = true)
	public List<Kategori> findKategoriesByName(String kategoriName,MatchMode mode) {
		// TODO Auto-generated method stub
		return kategoriDao.findKategoriesByName(kategoriName, mode);
	}
}
