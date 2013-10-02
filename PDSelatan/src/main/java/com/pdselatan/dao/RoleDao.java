package com.pdselatan.dao;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.Role;

public interface RoleDao extends AbstractDao<Role, Integer> {
    public void saveRole(Role role);
    public List<Role> findRolesbyName(String roleName, MatchMode mode);
    public Role findRoleById(String roleId);
}