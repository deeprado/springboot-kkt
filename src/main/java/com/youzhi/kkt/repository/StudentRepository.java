package com.youzhi.kkt.repository;

import com.youzhi.kkt.dao.StudentDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentDao, Integer> {
}
