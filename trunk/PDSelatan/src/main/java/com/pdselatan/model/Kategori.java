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

	private double kategoryId;
	private String kategoryName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "category_id")
	public double getKategoryId() {
		return kategoryId;
	}
	public void setKategoryId(double kategoryId) {
		this.kategoryId = kategoryId;
	}
	
	@Column(name = "category_name")
	public String getKategoryName() {
		return kategoryName;
	}
	public void setKategoryName(String kategoryName) {
		this.kategoryName = kategoryName;
	}
	
	@Override
	public String toString() {
		return "kategori [kategoryId=" + kategoryId + ", kategoryName="
				+ kategoryName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kategoryId);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((kategoryName == null) ? 0 : kategoryName.hashCode());
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
		if (Double.doubleToLongBits(kategoryId) != Double
				.doubleToLongBits(other.kategoryId))
			return false;
		if (kategoryName == null) {
			if (other.kategoryName != null)
				return false;
		} else if (!kategoryName.equals(other.kategoryName))
			return false;
		return true;
	}
}
