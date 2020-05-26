package com.youzhi.kkt.service.impl;

import com.youzhi.kkt.dao.ExamDao;
import com.youzhi.kkt.repository.ExamRepository;
import com.youzhi.kkt.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamRepository examRepository;

    @Override
    public List<ExamDao> findAll() {
        return examRepository.findAll();
    }

    @Override
    public List<ExamDao> findByMode(Integer mode) {
        return examRepository.findByMode(mode);
    }
}
