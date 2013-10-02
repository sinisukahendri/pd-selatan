package com.pdselatan.service;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.UserRole;

public interface UserRoleService {
	public void saveUserRole(UserRole userRole);
    public UserRole findUserRoleById(String userRoleId);
    public void deleteUserRoleByUserId(Integer userId);
}
