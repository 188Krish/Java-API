package com.smsproject.springsecurityjwt.service;

import com.smsproject.springsecurityjwt.model.User;

public interface UserInfoService {

    User get(String username);
}
