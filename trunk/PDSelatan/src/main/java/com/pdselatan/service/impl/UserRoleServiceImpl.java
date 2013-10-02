package com.pdselatan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdselatan.dao.UserRoleDao;
import com.pdselatan.model.UserRole;
import com.pdselatan.service.UserRoleService;

@Service("userRoleService")
@Transactional(readOnly = true)
public class UserRoleServiceImpl implements UserRoleService{

    @Autowired
    private UserRoleDao userRoleDao;

    @Transactional(readOnly = false)
	public void saveUserRole(UserRole userRole) {
		userRoleDao.saveUserRole(userRole);
	}

	public UserRole findUserRoleById(String userRoleId) {		
		return userRoleDao.findUserRoleById(userRoleId);
	}
	
	@Transactional(readOnly = false)
	public void deleteUserRoleByUserId(Integer userId) {
		userRoleDao.deleteUserRoleByUserId(userId);
	}
}
