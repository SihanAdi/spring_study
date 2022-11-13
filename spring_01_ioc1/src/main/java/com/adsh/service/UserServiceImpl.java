package com.adsh.service;

import com.adsh.dao.UserDao;
import com.adsh.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
