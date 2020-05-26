package com.youzhi.kkt.service.impl;

import com.youzhi.kkt.dao.StudentDao;
import com.youzhi.kkt.repository.StudentRepository;
import com.youzhi.kkt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentDao> findAll() {
        return studentRepository.findAll();
    }

}
