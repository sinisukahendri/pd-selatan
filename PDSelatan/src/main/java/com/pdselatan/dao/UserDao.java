package com.pdselatan.dao;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.User;

public interface UserDao extends AbstractDao<User, String> {
    public void saveUser(User user);
    public List<User> findUsersbyName(String userName, MatchMode mode);
    public User findUserById(String userName);
}
