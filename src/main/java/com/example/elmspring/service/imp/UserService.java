package com.example.elmspring.service.imp;

import com.example.elmspring.dao.IUserDao;
import com.example.elmspring.model.user;
import com.example.elmspring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserDao userDao;


    @Override
    public user login(user user){
     return userDao.login(user);
    }
}
