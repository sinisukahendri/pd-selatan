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
@Table (name = "tcustomer")
public class Customer extends BaseObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9220069096029194468L;
	
	private Double customerId;
	private String customerName;
	private String customerCategory;
	private String customerAddress1;
	private String customerAddress2;
	private String customerCity;
	private String customerPhone;
	private String customerNpwp;
	private String customerContractor;
	private Salesman salesman;
	private User modifier;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "customer_id")
	public Double getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Double customerId) {
		this.customerId = customerId;
	}
	
	@Column(name = "customer_name")
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	@Column(name = "customer_category")
	public String getCustomerCategory() {
		return customerCategory;
	}
	public void setCustomerCategory(String customerCategory) {
		this.customerCategory = customerCategory;
	}
	
	@Column(name = "customer_address1")
	public String getCustomerAddress1() {
		return customerAddress1;
	}
	public void setCustomerAddress1(String customerAddress1) {
		this.customerAddress1 = customerAddress1;
	}
	
	@Column(name = "customer_address2")
	public String getCustomerAddress2() {
		return customerAddress2;
	}
	public void setCustomerAddress2(String customerAddress2) {
		this.customerAddress2 = customerAddress2;
	}
	
	@Column(name = "customer_city")
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	@Column(name = "customer_phone")
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	@Column(name = "customer_npwp")
	public String getCustomerNpwp() {
		return customerNpwp;
	}
	public void setCustomerNpwp(String customerNpwp) {
		this.customerNpwp = customerNpwp;
	}
	
	@Column(name = "customer_contractor")
	public String getCustomerContractor() {
		return customerContractor;
	}
	public void setCustomerContractor(String customerContractor) {
		this.customerContractor = customerContractor;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "salesman_id", nullable = false)
	public Salesman getSalesman() {
		return salesman;
	}
	public void setSalesman(Salesman salesman) {
		this.salesman = salesman;
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
		return "Customer [customerId=" + customerId + ", customerName="
				+ customerName + ", customerCategory=" + customerCategory
				+ ", customerAddress1=" + customerAddress1
				+ ", customerAddress2=" + customerAddress2 + ", customerCity="
				+ customerCity + ", customerPhone=" + customerPhone
				+ ", customerNpwp=" + customerNpwp + ", customerContractor="
				+ customerContractor + ", salesman=" + salesman + ", modifier="
				+ modifier + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((customerAddress1 == null) ? 0 : customerAddress1.hashCode());
		result = prime
				* result
				+ ((customerAddress2 == null) ? 0 : customerAddress2.hashCode());
		result = prime
				* result
				+ ((customerCategory == null) ? 0 : customerCategory.hashCode());
		result = prime * result
				+ ((customerCity == null) ? 0 : customerCity.hashCode());
		result = prime
				* result
				+ ((customerContractor == null) ? 0 : customerContractor
						.hashCode());
		result = prime * result
				+ ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result
				+ ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result
				+ ((customerNpwp == null) ? 0 : customerNpwp.hashCode());
		result = prime * result
				+ ((customerPhone == null) ? 0 : customerPhone.hashCode());
		result = prime * result
				+ ((modifier == null) ? 0 : modifier.hashCode());
		result = prime * result
				+ ((salesman == null) ? 0 : salesman.hashCode());
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
		Customer other = (Customer) obj;
		if (customerAddress1 == null) {
			if (other.customerAddress1 != null)
				return false;
		} else if (!customerAddress1.equals(other.customerAddress1))
			return false;
		if (customerAddress2 == null) {
			if (other.customerAddress2 != null)
				return false;
		} else if (!customerAddress2.equals(other.customerAddress2))
			return false;
		if (customerCategory == null) {
			if (other.customerCategory != null)
				return false;
		} else if (!customerCategory.equals(other.customerCategory))
			return false;
		if (customerCity == null) {
			if (other.customerCity != null)
				return false;
		} else if (!customerCity.equals(other.customerCity))
			return false;
		if (customerContractor == null) {
			if (other.customerContractor != null)
				return false;
		} else if (!customerContractor.equals(other.customerContractor))
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (customerNpwp == null) {
			if (other.customerNpwp != null)
				return false;
		} else if (!customerNpwp.equals(other.customerNpwp))
			return false;
		if (customerPhone == null) {
			if (other.customerPhone != null)
				return false;
		} else if (!customerPhone.equals(other.customerPhone))
			return false;
		if (modifier == null) {
			if (other.modifier != null)
				return false;
		} else if (!modifier.equals(other.modifier))
			return false;
		if (salesman == null) {
			if (other.salesman != null)
				return false;
		} else if (!salesman.equals(other.salesman))
			return false;
		return true;
	}
	
	
}
