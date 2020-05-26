package com.youzhi.kkt.dao;


import lombok.Data;

import javax.persistence.*;

/**
 * 考题
 */

@Data
@Entity
@Table(name = "kt_ques")
public class QuesDao {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer quesId;

    // 题库ID
//    @Column(name = "bankId")
    private Integer bankId;

    // 题目
    private String title;

    // 分析
    private String analysis;

    // 类型
    private Integer type;
}
