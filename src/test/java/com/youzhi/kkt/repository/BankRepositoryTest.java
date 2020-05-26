package com.youzhi.kkt.repository;

import com.youzhi.kkt.dao.BankDao;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class BankRepositoryTest {

    @Autowired
    private BankRepository bankRepository;

    @Test
    void findAll() {
        List<BankDao> list = bankRepository.findAll();
        Assert.assertTrue(list.size() > 0);
    }
}