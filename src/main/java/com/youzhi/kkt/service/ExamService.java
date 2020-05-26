package com.youzhi.kkt.service;

import com.youzhi.kkt.dao.ExamDao;

import java.util.List;

public interface ExamService {
    // 全部考试
    List<ExamDao> findAll();
    // 模型考试
    List<ExamDao> findByMode(Integer mode);
}
