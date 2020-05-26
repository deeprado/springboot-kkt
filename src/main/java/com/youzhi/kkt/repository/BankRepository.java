package com.youzhi.kkt.repository;

import com.youzhi.kkt.dao.BankDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<BankDao, Integer> {

}
