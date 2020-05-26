package com.youzhi.kkt.repository;

import com.youzhi.kkt.dao.QuesDao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuesRepository extends JpaRepository<QuesDao, Integer> {
    List<QuesDao> findByType(Integer type);
    List<QuesDao> findByBankId(Integer bankId);
}
