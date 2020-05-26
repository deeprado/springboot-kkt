package com.youzhi.kkt.dao;


import lombok.Data;

import javax.persistence.*;

/**
 * 题库
 */
@Data
@Entity
@Table(name = "kt_bank")
public class BankDao {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private  Integer bankId;

    // 题库名称
    private String title;

    // 题库描述
    private String description;

}
