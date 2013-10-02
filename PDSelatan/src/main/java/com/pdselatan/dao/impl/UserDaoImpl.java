package com.pdselatan.dao.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.pdselatan.dao.UserDao;
import com.pdselatan.model.User;

@Repository
public class UserDaoImpl extends AbstractDaoImpl<User, Integer> implements UserDao {

    protected UserDaoImpl() {
        super(User.class);
    }

    public void saveUser(User user) {
        saveOrUpdate(user);
    }

    public List<User> findUsersbyName(String criteria, String value, MatchMode mode) {    	
        return findByCriteria(Restrictions.like(criteria, value, mode));
    }
    
    
    public User findUserById(String userId) {
        return findById(Integer.parseInt(userId));
    }
	
}
