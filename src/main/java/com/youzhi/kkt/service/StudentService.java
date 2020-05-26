package com.youzhi.kkt.service;

import com.youzhi.kkt.dao.StudentDao;

import java.util.List;

public interface StudentService {
    // 全部考生
    List<StudentDao> findAll();
}
