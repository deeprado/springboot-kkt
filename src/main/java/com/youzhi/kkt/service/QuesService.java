package com.youzhi.kkt.service;

import com.youzhi.kkt.dao.QuesDao;

import java.util.List;

public interface QuesService {
    // 全部考题
    List<QuesDao> findAll();
    // 类型考题
    List<QuesDao> findByType(Integer type);
}
