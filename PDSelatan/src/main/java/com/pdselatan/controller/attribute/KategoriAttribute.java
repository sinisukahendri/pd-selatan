package com.pdselatan.controller.attribute;

import java.util.List;

import com.pdselatan.model.Kategori;

public class KategoriAttribute extends BasePageAttribute{
	private List<Kategori> kategories;
	private String deletedKategori;
	private Kategori savedKategori;
	
	public List<Kategori> getKategories() {
		return kategories;
	}
	public void setKategories(List<Kategori> kategories) {
		this.kategories = kategories;
	}
	public String getDeletedKategori() {
		return deletedKategori;
	}
	public void setDeletedKategori(String deletedKategori) {
		this.deletedKategori = deletedKategori;
	}
	public Kategori getSavedKategori() {
		return savedKategori;
	}
	public void setSavedKategori(Kategori savedKategori) {
		this.savedKategori = savedKategori;
	}
	
	
}
