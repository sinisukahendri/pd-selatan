package com.pdselatan.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdselatan.dao.HargaBarangDao;
import com.pdselatan.model.HargaBarang;
import com.pdselatan.service.HargaBarangService;

@Service("hargaBarangService")
@Transactional(readOnly = true)
public class HargaBarangServiceImpl implements HargaBarangService {

	@Autowired
	private HargaBarangDao hargaBarangDao;
	Logger logger = Logger.getLogger(HargaBarangServiceImpl.class);
	
	@Transactional(readOnly =false)
	public void saveHargaBarang(HargaBarang hargaBarang) {
		// TODO Auto-generated method stub
		hargaBarangDao.saveHargaBarang(hargaBarang);
	}

	@Transactional(readOnly =false)
	public void deleteHargaBarang(HargaBarang hargaBarang) {
		// TODO Auto-generated method stub
		hargaBarangDao.deleteHargaBarang(hargaBarang);
	}

	public HargaBarang findHargaBarangById(String idHargaBarang) {
		// TODO Auto-generated method stub
		return hargaBarangDao.findHargaBarangById(idHargaBarang);
	}

	public List<HargaBarang> findHargaBarangByKategory(String kategoryName) {
		// TODO Auto-generated method stub
		return hargaBarangDao.findHargaBarangByKategory(kategoryName);
	}
	
}
