package com.pdselatan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.pdselatan.model.BaseObject;

@Entity
@Table(name="titem_price")
public class HargaBarang extends BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8067815219191615810L;
	private Integer priceId;
	private String priceName;
	private String pricePl;
	private String priceM;
	private String priceR;
	private String priceD;
	private String priceP;
	private Kategori kategori;
	private User modifier;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "price_id")
	public Integer getPriceId() {
		return priceId;
	}
	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
	}
	@Column(name = "price_name")
	public String getPriceName() {
		return priceName;
	}
	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}
	@Column(name = "price_pl")
	public String getPricePl() {
		return pricePl;
	}
	public void setPricePl(String pricePl) {
		this.pricePl = pricePl;
	}
	@Column(name = "price_m")
	public String getPriceM() {
		return priceM;
	}
	public void setPriceM(String priceM) {
		this.priceM = priceM;
	}
	@Column(name = "price_r")
	public String getPriceR() {
		return priceR;
	}
	public void setPriceR(String priceR) {
		this.priceR = priceR;
	}
	@Column(name = "price_d")
	public String getPriceD() {
		return priceD;
	}
	public void setPriceD(String priceD) {
		this.priceD = priceD;
	}
	@Column(name = "price_p")
	public String getPriceP() {
		return priceP;
	}
	public void setPriceP(String priceP) {
		this.priceP = priceP;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id", nullable = false)
	public Kategori getKategori() {
		return kategori;
	}
	public void setKategori(Kategori kategori) {
		this.kategori = kategori;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "modifier_id", nullable = false)
	public User getModifier() {
		return modifier;
	}
	public void setModifier(User modifier) {
		this.modifier = modifier;
	}
	
	@Override
	public String toString() {
		return "HargaBarang [priceId=" + priceId + ", priceName=" + priceName
				+ ", pricePl=" + pricePl + ", priceM=" + priceM + ", priceR="
				+ priceR + ", priceD=" + priceD + ", priceP=" + priceP
				+ ", kategori=" + kategori + ", modifier=" + modifier + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((kategori == null) ? 0 : kategori.hashCode());
		result = prime * result
				+ ((modifier == null) ? 0 : modifier.hashCode());
		result = prime * result + ((priceD == null) ? 0 : priceD.hashCode());
		result = prime * result + ((priceId == null) ? 0 : priceId.hashCode());
		result = prime * result + ((priceM == null) ? 0 : priceM.hashCode());
		result = prime * result
				+ ((priceName == null) ? 0 : priceName.hashCode());
		result = prime * result + ((priceP == null) ? 0 : priceP.hashCode());
		result = prime * result + ((pricePl == null) ? 0 : pricePl.hashCode());
		result = prime * result + ((priceR == null) ? 0 : priceR.hashCode());
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
		HargaBarang other = (HargaBarang) obj;
		if (kategori == null) {
			if (other.kategori != null)
				return false;
		} else if (!kategori.equals(other.kategori))
			return false;
		if (modifier == null) {
			if (other.modifier != null)
				return false;
		} else if (!modifier.equals(other.modifier))
			return false;
		if (priceD == null) {
			if (other.priceD != null)
				return false;
		} else if (!priceD.equals(other.priceD))
			return false;
		if (priceId == null) {
			if (other.priceId != null)
				return false;
		} else if (!priceId.equals(other.priceId))
			return false;
		if (priceM == null) {
			if (other.priceM != null)
				return false;
		} else if (!priceM.equals(other.priceM))
			return false;
		if (priceName == null) {
			if (other.priceName != null)
				return false;
		} else if (!priceName.equals(other.priceName))
			return false;
		if (priceP == null) {
			if (other.priceP != null)
				return false;
		} else if (!priceP.equals(other.priceP))
			return false;
		if (pricePl == null) {
			if (other.pricePl != null)
				return false;
		} else if (!pricePl.equals(other.pricePl))
			return false;
		if (priceR == null) {
			if (other.priceR != null)
				return false;
		} else if (!priceR.equals(other.priceR))
			return false;
		return true;
	}
	
	
}
