package com.pdselatan.dao;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.User;

public interface UserDao extends AbstractDao<User, Integer> {
    public void saveUser(User user);
    public List<User> findUsersbyName(String criteria, String value, MatchMode mode);
    public User findUserById(String userId);
}
