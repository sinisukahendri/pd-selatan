package com.pdselatan.dao;


import com.pdselatan.model.UserRole;

public interface UserRoleDao extends AbstractDao<UserRole, Integer> {
    public void saveUserRole(UserRole userRole);
    public UserRole findUserRoleById(String userRoleId);
    public void deleteUserRoleByUserId(Integer userId);
}
