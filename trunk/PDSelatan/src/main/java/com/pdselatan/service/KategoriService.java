package com.pdselatan.service;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.Kategori;

public interface KategoriService {
	void saveOrUpdateKategori(Kategori kategori);
	void deleteKategori(Kategori kategori);
	Kategori findKategoriById(String kategoriId);
	List<Kategori> findKategoriesByName(String kategoriName, MatchMode mode);
}
