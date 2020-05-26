package com.youzhi.kkt.repository;

import com.youzhi.kkt.dao.UserDao;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void findByUsername() {
        String username = "aaa";
        UserDao userDao = userRepository.findByUsername(username);
        Assert.assertTrue(userDao.getPassword().equals("bbb"));
    }
}