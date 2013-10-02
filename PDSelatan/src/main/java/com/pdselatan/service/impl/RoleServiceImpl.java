package com.pdselatan.service.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdselatan.dao.RoleDao;
import com.pdselatan.model.Role;
import com.pdselatan.service.RoleService;

@Service("roleService")
@Transactional(readOnly = true)
public class RoleServiceImpl implements RoleService {

	@Autowired
    private RoleDao roleDao;
  

    public Role findRoleById(String roleId) {
        return roleDao.findRoleById(roleId);
    }

    @Transactional(readOnly = false)
    public void saveRole(Role role) {
        roleDao.saveRole(role);
    }

    @Transactional(readOnly = false)
    public void deleteRole(String roleId) {
        Role role = roleDao.findRoleById(roleId);
        if (role != null) {
            roleDao.delete(role);
        }
    }

    public List<Role> findRoles(String role, MatchMode mode) {
        return roleDao.findRolesbyName(role, mode);
    }
	
}
