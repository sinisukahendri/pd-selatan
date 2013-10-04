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
@Table(name="tsupplier")
public class Supplier extends BaseObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6246214368988912532L;
	private Integer supplierId;
	private String supplierName;
	private String supplierAddress;
	private String supplierPhone;
	private String supplierContact;
	private User modifier;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "supplier_id")
	public Integer getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}
	
	@Column(name = "supplier_name")
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	@Column(name = "supplier_address")
	public String getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	
	@Column(name = "supplier_phone")
	public String getSupplierPhone() {
		return supplierPhone;
	}
	public void setSupplierPhone(String supplierPhone) {
		this.supplierPhone = supplierPhone;
	}
	
	@Column(name = "supplier_contact")
	public String getSupplierContact() {
		return supplierContact;
	}
	public void setSupplierContact(String supplierContact) {
		this.supplierContact = supplierContact;
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
		return "Supplier [supplierId=" + supplierId + ", supplierName="
				+ supplierName + ", supplierAddress=" + supplierAddress
				+ ", supplierPhone=" + supplierPhone + ", supplierContact="
				+ supplierContact + ", modifier=" + modifier + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((modifier == null) ? 0 : modifier.hashCode());
		result = prime * result
				+ ((supplierAddress == null) ? 0 : supplierAddress.hashCode());
		result = prime * result
				+ ((supplierContact == null) ? 0 : supplierContact.hashCode());
		result = prime * result
				+ ((supplierId == null) ? 0 : supplierId.hashCode());
		result = prime * result
				+ ((supplierName == null) ? 0 : supplierName.hashCode());
		result = prime * result
				+ ((supplierPhone == null) ? 0 : supplierPhone.hashCode());
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
		Supplier other = (Supplier) obj;
		if (modifier == null) {
			if (other.modifier != null)
				return false;
		} else if (!modifier.equals(other.modifier))
			return false;
		if (supplierAddress == null) {
			if (other.supplierAddress != null)
				return false;
		} else if (!supplierAddress.equals(other.supplierAddress))
			return false;
		if (supplierContact == null) {
			if (other.supplierContact != null)
				return false;
		} else if (!supplierContact.equals(other.supplierContact))
			return false;
		if (supplierId == null) {
			if (other.supplierId != null)
				return false;
		} else if (!supplierId.equals(other.supplierId))
			return false;
		if (supplierName == null) {
			if (other.supplierName != null)
				return false;
		} else if (!supplierName.equals(other.supplierName))
			return false;
		if (supplierPhone == null) {
			if (other.supplierPhone != null)
				return false;
		} else if (!supplierPhone.equals(other.supplierPhone))
			return false;
		return true;
	}

}
