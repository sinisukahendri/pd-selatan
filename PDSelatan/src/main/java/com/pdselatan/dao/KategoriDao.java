package com.pdselatan.dao;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.Kategori;;

public interface KategoriDao extends AbstractDao<Kategori, String>{
	public void saveKategori(Kategori kategori);
	public void deleteKategori(Kategori kategori);
    public Kategori findKategoriById(String kategoriId);
    public List<Kategori> findKategoriesByName(String kategoriName, MatchMode mode);
}
