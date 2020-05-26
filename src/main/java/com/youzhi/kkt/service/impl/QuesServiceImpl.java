package com.youzhi.kkt.service.impl;

import com.youzhi.kkt.dao.QuesDao;
import com.youzhi.kkt.repository.QuesRepository;
import com.youzhi.kkt.service.QuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuesServiceImpl implements QuesService {

    @Autowired
    private QuesRepository quesRepository;

    @Override
    public List<QuesDao> findAll() {
        return quesRepository.findAll();
    }

    @Override
    public List<QuesDao> findByType(Integer type) {
        return quesRepository.findByType(type);
    }
}
