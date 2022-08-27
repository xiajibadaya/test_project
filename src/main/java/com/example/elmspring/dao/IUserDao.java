package com.example.elmspring.dao;

import com.example.elmspring.model.user;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    public user login(user user);
}
