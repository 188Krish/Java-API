package com.smsproject.springsecurityjwt.service;

import com.smsproject.springsecurityjwt.dao.UserInfoDao;
import com.smsproject.springsecurityjwt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoDao userInfoDao;

    @Transactional
    @Override
    public User get(String username) {
        return userInfoDao.findByUsername(username);
    }

}

