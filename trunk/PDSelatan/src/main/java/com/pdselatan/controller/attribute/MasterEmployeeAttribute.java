package com.pdselatan.controller.attribute;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.pdselatan.model.Role;
import com.pdselatan.model.User;

public class MasterEmployeeAttribute {

	private String empNameNew;
	private String empPhoneNew;
	private String userNameNew;
	private String passwordNew;
	private String userIdSelected;
	private String empAddressNew;

	private List<User> userList;
	private User userAddOrUpdate;
	private List<Role> roleList;
	private String[] rolesSelected;

	private HashMap<String, Role> roleMap;
	private String userNameSearch;
	
	
	

	public String getUserNameSearch() {
		return userNameSearch;
	}

	public void setUserNameSearch(String userNameSearch) {
		this.userNameSearch = userNameSearch;
	}

	public HashMap<String, Role> getRoleMap() {
		return roleMap;
	}

	public void setRoleMap(HashMap<String, Role> roleMap) {
		this.roleMap = roleMap;
	}

	public String getEmpAddressNew() {
		return empAddressNew;
	}

	public void setEmpAddressNew(String empAddressNew) {
		this.empAddressNew = empAddressNew;
	}

	public String getEmpNameNew() {
		return empNameNew;
	}

	public void setEmpNameNew(String empNameNew) {
		this.empNameNew = empNameNew;
	}

	public String getEmpPhoneNew() {
		return empPhoneNew;
	}

	public void setEmpPhoneNew(String empPhoneNew) {
		this.empPhoneNew = empPhoneNew;
	}

	public String getUserNameNew() {
		return userNameNew;
	}

	public void setUserNameNew(String userNameNew) {
		this.userNameNew = userNameNew;
	}

	public String getPasswordNew() {
		return passwordNew;
	}

	public void setPasswordNew(String passwordNew) {
		this.passwordNew = passwordNew;
	}

	public String getUserIdSelected() {
		return userIdSelected;
	}

	public void setUserIdSelected(String userIdSelected) {
		this.userIdSelected = userIdSelected;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public User getUserAddOrUpdate() {
		return userAddOrUpdate;
	}

	public void setUserAddOrUpdate(User userAddOrUpdate) {
		this.userAddOrUpdate = userAddOrUpdate;
	}

	public String[] getRolesSelected() {
		return rolesSelected;
	}

	public void setRolesSelected(String[] rolesSelected) {
		this.rolesSelected = rolesSelected;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	
	
	
}
