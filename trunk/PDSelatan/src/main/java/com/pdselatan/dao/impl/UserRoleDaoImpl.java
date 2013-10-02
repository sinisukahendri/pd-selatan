package com.pdselatan.dao.impl;


import org.springframework.stereotype.Repository;

import com.pdselatan.dao.UserRoleDao;
import com.pdselatan.model.UserRole;

@Repository
public class UserRoleDaoImpl extends AbstractDaoImpl<UserRole, Integer> implements UserRoleDao {

    protected UserRoleDaoImpl() {
        super(UserRole.class);
    }

    public void saveUserRole(UserRole userRole) {
        saveOrUpdate(userRole);
    }

    public UserRole findUserRoleById(String userRoleId) {
        return findById(Integer.parseInt(userRoleId));
    }

	public void deleteUserRoleByUserId(Integer userId) {
		String query = "delete UserRole r where r.user.userId = " + userId;
		getCurrentSession().createQuery(query).executeUpdate();
	}
}
