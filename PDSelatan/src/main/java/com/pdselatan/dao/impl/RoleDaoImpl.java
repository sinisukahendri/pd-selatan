package com.pdselatan.dao.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.pdselatan.dao.RoleDao;
import com.pdselatan.model.Role;

@Repository
public class RoleDaoImpl extends AbstractDaoImpl<Role, Integer> implements RoleDao {

    protected RoleDaoImpl() {
        super(Role.class);
    }

    public void saveRole(Role role) {
        saveOrUpdate(role);
    }

    public List<Role> findRolesbyName(String roleName, MatchMode mode) {    	
        return findByCriteria(Restrictions.like("roleName", roleName, mode));
    }        
    
    public Role findRoleById(String roleId) {
        return findById(Integer.parseInt(roleId));
    }
}
