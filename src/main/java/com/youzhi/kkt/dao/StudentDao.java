package com.youzhi.kkt.dao;

import lombok.Data;

import javax.persistence.*;

/**
 * 考生
 */
@Data
@Entity
@Table(name = "kt_student")
public class StudentDao {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer stuId;

    // 姓名
    private String name;

    // 手机号1
    private String mobile;

}
