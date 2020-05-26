package com.youzhi.kkt.service;


import com.youzhi.kkt.dao.UserDao;

public interface UserService {
    UserDao findByUsername(String username);
    UserDao insert(String username, String password);
}
