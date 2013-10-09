package com.pdselatan.controller.attribute;

import java.util.List;

import com.pdselatan.model.HargaBarang;
import com.pdselatan.model.Kategori;

public class HargaBarangAttribute extends BasePageAttribute {
	private String deletedHargaBarang;
	private List<HargaBarang> hargaBarangs;
	private HargaBarang savedHargaBarang;
	
	private List<Kategori> kategories;
	
	public String getDeletedHargaBarang() {
		return deletedHargaBarang;
	}
	public void setDeletedHargaBarang(String deletedHargaBarang) {
		this.deletedHargaBarang = deletedHargaBarang;
	}
	public List<HargaBarang> getHargaBarangs() {
		return hargaBarangs;
	}
	public void setHargaBarangs(List<HargaBarang> hargaBarangs) {
		this.hargaBarangs = hargaBarangs;
	}
	public HargaBarang getSavedHargaBarang() {
		return savedHargaBarang;
	}
	public void setSavedHargaBarang(HargaBarang savedHargaBarang) {
		this.savedHargaBarang = savedHargaBarang;
	}
	public List<Kategori> getKategories() {
		return kategories;
	}
	public void setKategories(List<Kategori> kategories) {
		this.kategories = kategories;
	}

	
}
