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

@Entity
@Table (name = "tsalesman")
public class Salesman extends BaseObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2244798948087820146L;
	private Double salesmanId;
	private String salesmanName;
	private User modifier;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "salesman_id")
	public Double getSalesmanId() {
		return salesmanId;
	}
	public void setSalesmanId(Double salesmanId) {
		this.salesmanId = salesmanId;
	}

	@Column(name = "salesman_name")
	public String getSalesmanName() {
		return salesmanName;
	}
	
	public void setSalesmanName(String salesmanName) {
		this.salesmanName = salesmanName;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((salesmanId == null) ? 0 : salesmanId.hashCode());
		result = prime * result
				+ ((salesmanName == null) ? 0 : salesmanName.hashCode());
		result = prime * result + ((modifier == null) ? 0 : modifier.hashCode());
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
		Salesman other = (Salesman) obj;
		if (salesmanId == null) {
			if (other.salesmanId != null)
				return false;
		} else if (!salesmanId.equals(other.salesmanId))
			return false;
		if (salesmanName == null) {
			if (other.salesmanName != null)
				return false;
		} else if (!salesmanName.equals(other.salesmanName))
			return false;
		if (modifier == null) {
			if (other.modifier != null)
				return false;
		} else if (!modifier.equals(other.modifier))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Salesman [salesmanId=" + salesmanId + ", salesmanName="
				+ salesmanName + ", modifier=" + modifier + "]";
	}
	
	
}
