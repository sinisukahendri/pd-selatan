package com.pdselatan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "titem_category")
public class Kategori extends BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5538684417563789987L;

	private Double kategoriId;
	private String kategoriName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "category_id")
	public Double getKategoriId() {
		return kategoriId;
	}
	public void setKategoriId(Double kategoriId) {
		this.kategoriId = kategoriId;
	}
	
	@Column(name = "category_name")
	public String getKategoriName() {
		return kategoriName;
	}
	public void setKategoriName(String kategoriName) {
		this.kategoriName = kategoriName;
	}
	
	@Override
	public String toString() {
		return "kategori [kategoryId=" + kategoriId + ", kategoryName="
				+ kategoriName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kategoriId);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((kategoriName == null) ? 0 : kategoriName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kategori other = (Kategori) obj;
		if (Double.doubleToLongBits(kategoriId) != Double
				.doubleToLongBits(other.kategoriId))
			return false;
		if (kategoriName == null) {
			if (other.kategoriName != null)
				return false;
		} else if (!kategoriName.equals(other.kategoriName))
			return false;
		return true;
	}
}
