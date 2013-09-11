package com.pdselatan.service.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdselatan.dao.UserDao;
import com.pdselatan.model.User;
import com.pdselatan.service.UserService;

@Service("userService")
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
  

    public User findByUserName(String userName) {
        return userDao.findUserById(userName);
    }

    @Transactional(readOnly = false)
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Transactional(readOnly = false)
    public void deleteUser(String userName) {
        User user = userDao.findById(userName);
        if (user != null) {
            userDao.delete(user);
        }
    }

    public List<User> findUsers(String user, MatchMode mode) {
        return userDao.findUsersbyName(user, mode);
    }
    
   
}
