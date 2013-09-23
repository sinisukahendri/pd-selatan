package com.pdselatan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tbank")
public class Bank extends BaseObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3275645141915626773L;
	private Double bankId;
	private String bankName;
	private String bankNote;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "bank_id")
	public Double getBankId() {
		return bankId;
	}
	public void setBankId(Double bankId) {
		this.bankId = bankId;
	}
	
	@Column(name = "bank_name")
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	@Column(name = "bank_note")
	public String getBankNote() {
		return bankNote;
	}
	public void setBankNote(String bankNote) {
		this.bankNote = bankNote;
	}
	
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName
				+ ", bankNote=" + bankNote + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(bankId);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result
				+ ((bankNote == null) ? 0 : bankNote.hashCode());
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
		Bank other = (Bank) obj;
		if (Double.doubleToLongBits(bankId) != Double
				.doubleToLongBits(other.bankId))
			return false;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (bankNote == null) {
			if (other.bankNote != null)
				return false;
		} else if (!bankNote.equals(other.bankNote))
			return false;
		return true;
	}
}
