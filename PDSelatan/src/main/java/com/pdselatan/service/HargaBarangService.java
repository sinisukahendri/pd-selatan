package com.pdselatan.service;

import java.util.List;

import com.pdselatan.model.HargaBarang;

public interface HargaBarangService {
	void saveHargaBarang(HargaBarang hargaBarang);
	void deleteHargaBarang(HargaBarang hargaBarang);
	HargaBarang findHargaBarangById(String idHargaBarang);
	List<HargaBarang> findHargaBarangByKategory(String kategoryName);
}
