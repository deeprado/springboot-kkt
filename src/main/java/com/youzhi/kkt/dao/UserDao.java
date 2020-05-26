package com.youzhi.kkt.dao;

import lombok.Data;

import javax.persistence.*;

/**
 * 用户
 */

@Data
@Entity
@Table(name = "kt_user")
public class UserDao {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer userId;

    // 用户名
    private String username;

    // 密码
    private String password;

}
