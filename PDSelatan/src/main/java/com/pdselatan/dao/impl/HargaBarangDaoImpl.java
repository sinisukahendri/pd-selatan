package com.pdselatan.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pdselatan.dao.HargaBarangDao;
import com.pdselatan.model.HargaBarang;

@Repository
public class HargaBarangDaoImpl extends AbstractDaoImpl<HargaBarang,String> implements HargaBarangDao {
	
	protected HargaBarangDaoImpl(){
		super(HargaBarang.class);
	}

	public void saveHargaBarang(HargaBarang hargaBarang) {
		// TODO Auto-generated method stub
		saveOrUpdate(hargaBarang);
	}

	public void deleteHargaBarang(HargaBarang hargaBarang) {
		// TODO Auto-generated method stub
		delete(hargaBarang);
	}

	public HargaBarang findHargaBarangById(String idHargaBarang) {
		// TODO Auto-generated method stub
		return findById(idHargaBarang);
	}

	public List<HargaBarang> findHargaBarangByKategory(String kategoryName) {
		// TODO Auto-generated method stub
		StringBuilder hql;
		if(kategoryName==null || kategoryName.equals(""))
			hql = new StringBuilder("from HargaBarang");
		else
			hql = new StringBuilder("from HargaBarang hb where hb.kategori.kategoriName like('"+kategoryName+"')");
		
		return findByHQL(hql);
	}

	
}
