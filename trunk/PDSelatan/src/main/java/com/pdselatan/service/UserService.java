package com.pdselatan.service;

import java.util.List;

import org.hibernate.criterion.MatchMode;

import com.pdselatan.model.User;

public interface UserService {

    User findUserById(String userId);
    void saveUser(User user);
    void deleteUser(String userId);
    List<User> findUsers(String criteria, String value, MatchMode mode);
}
