package com.pdselatan.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table (name = "USERS")
public class User extends BaseObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5340782969681306637L;
	
	private String username;
	private String password;
	private Integer userId;
	private boolean enabled;
	private Date createdDate;
	private String createdBy;
	private Set<UserRole> roles = new HashSet<UserRole>(0);
	
	//EMPLOYEE DATA
	private String empName;
	private String empAddress;
	private String empPhone;
	private EmployeeGroup empGroup;
	
	
	
    @Column(name = "USER_NAME")    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "USER_ID")
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "ENABLED")
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}	
	
	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "CREATED_DATE")
	@Type(type="timestamp")
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	@Column(name = "CREATED_BY")
	public String getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserRole> getRoles() {
		return roles;
	}
	public void setRoles(Set<UserRole> roles) {
		this.roles = roles;
	}
	
	@Column(name = "EMPLOYEE_NAME")
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Column(name = "EMPLOYEE_ADDRESS")
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	@Column(name = "EMPLOYEE_PHONE")
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GROUP_ID", nullable = false)
	public EmployeeGroup getEmpGroup() {
		return empGroup;
	}
	public void setEmpGroup(EmployeeGroup empGroup) {
		this.empGroup = empGroup;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result
				+ ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result
				+ ((empAddress == null) ? 0 : empAddress.hashCode());
		result = prime * result
				+ ((empGroup == null) ? 0 : empGroup.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result
				+ ((empPhone == null) ? 0 : empPhone.hashCode());
		result = prime * result + (enabled ? 1231 : 1237);
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
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
		User other = (User) obj;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (empAddress == null) {
			if (other.empAddress != null)
				return false;
		} else if (!empAddress.equals(other.empAddress))
			return false;
		if (empGroup == null) {
			if (other.empGroup != null)
				return false;
		} else if (!empGroup.equals(other.empGroup))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empPhone == null) {
			if (other.empPhone != null)
				return false;
		} else if (!empPhone.equals(other.empPhone))
			return false;
		if (enabled != other.enabled)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", enabled=");
		builder.append(enabled);
		builder.append(", createdDate=");
		builder.append(createdDate);
		builder.append(", createdBy=");
		builder.append(createdBy);		
		builder.append(", empName=");
		builder.append(empName);
		builder.append(", empAddress=");
		builder.append(empAddress);
		builder.append(", empPhone=");
		builder.append(empPhone);
		builder.append(", empGroup=");
		builder.append(empGroup);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
