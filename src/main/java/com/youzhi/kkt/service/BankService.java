package com.youzhi.kkt.service;

import com.youzhi.kkt.dao.BankDao;

import java.util.List;

public interface BankService {
    List<BankDao> findAll();
}
