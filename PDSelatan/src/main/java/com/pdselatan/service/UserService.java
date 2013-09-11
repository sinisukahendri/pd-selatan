package com.pdselatan.service;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.User;

public interface UserService {

    User findByUserName(String userName);
    void saveUser(User user);
    void deleteUser(String userName);
    List<User> findUsers(String user, MatchMode mode);
}
