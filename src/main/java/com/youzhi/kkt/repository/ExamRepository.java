package com.youzhi.kkt.repository;


import com.youzhi.kkt.dao.ExamDao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamRepository  extends JpaRepository<ExamDao, Integer>{
    List<ExamDao> findByMode(Integer mode);
}
