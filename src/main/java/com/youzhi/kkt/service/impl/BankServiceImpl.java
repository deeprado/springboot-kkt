package com.youzhi.kkt.service.impl;

import com.youzhi.kkt.dao.BankDao;
import com.youzhi.kkt.repository.BankRepository;
import com.youzhi.kkt.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepository bankRepository;

    @Override
    public List<BankDao> findAll() {
        return bankRepository.findAll();
    }
}
