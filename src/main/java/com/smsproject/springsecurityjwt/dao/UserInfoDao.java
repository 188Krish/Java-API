package com.smsproject.springsecurityjwt.dao;

import com.smsproject.springsecurityjwt.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserInfoDao extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
