package com.pdselatan.dao.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.pdselatan.dao.KategoriDao;
import com.pdselatan.model.Kategori;

@Repository
public class KategoriDaoImpl extends AbstractDaoImpl<Kategori,String> implements KategoriDao {

	protected KategoriDaoImpl() {
		super(Kategori.class);
		// TODO Auto-generated constructor stub
	}

	public void saveKategori(Kategori kategori) {
		// TODO Auto-generated method stub
		saveOrUpdate(kategori);
	}

	public void deleteKategori(Kategori kategori) {
		// TODO Auto-generated method stub
		delete(kategori);
	}

	public Kategori findKategoriById(String kategoriId) {
		// TODO Auto-generated method stub
		return findById(kategoriId);
	}

	public List<Kategori> findKategoriesByName(String kategoriName, MatchMode mode) {
		// TODO Auto-generated method stub
		return findByCriteria(Restrictions.like("kategoriName", kategoriName, mode));
	}

}
