package com.pdselatan.dao;

import java.util.List;

import com.pdselatan.model.HargaBarang;

public interface HargaBarangDao extends AbstractDao<HargaBarang, String> {
	public void saveHargaBarang(HargaBarang hargaBarang);
	public void deleteHargaBarang(HargaBarang hargaBarang);
	public HargaBarang findHargaBarangById(String idHargaBarang);
	public List<HargaBarang> findHargaBarangByKategory(String kategoryName);
}
