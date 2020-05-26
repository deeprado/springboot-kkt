package com.youzhi.kkt.repository;

import com.youzhi.kkt.dao.QuesDao;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class QuesRepositoryTest {

    @Autowired
    private  QuesRepository quesRepository;

    @Test
    void findByType() {
        Integer type = 1;
        List<QuesDao> list = quesRepository.findByType(type);
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    void findByBankId() {
        Integer bankId = 1;
        List<QuesDao> list = quesRepository.findByBankId(bankId);
        Assert.assertTrue(list.size() == 2);
    }
}