package com.youzhi.kkt.repository;

import com.youzhi.kkt.dao.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}
