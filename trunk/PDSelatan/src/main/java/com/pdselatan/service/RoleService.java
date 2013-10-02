package com.pdselatan.service;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.Role;

public interface RoleService {

    Role findRoleById(String roleId);
    void saveRole(Role role);
    void deleteRole(String roleName);
    List<Role> findRoles(String role, MatchMode mode);
}