package com.youzhi.kkt.service.impl;

import com.youzhi.kkt.dao.UserDao;
import com.youzhi.kkt.repository.UserRepository;
import com.youzhi.kkt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDao findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public UserDao insert(String username, String password) {
        UserDao userDao = new UserDao();
        userDao.setUsername(username);
        userDao.setPassword(password);
        return userRepository.save(userDao);
    }
}
