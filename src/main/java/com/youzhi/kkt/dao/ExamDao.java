package com.youzhi.kkt.dao;

import lombok.Data;

import javax.persistence.*;

/**
 *
 */

@Data
@Entity
@Table(name = "kt_exam")
public class ExamDao {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer examId;

    // 考试名称
    private String title;

    // 考试描述
    private String description;

    // 考试模式
    private Integer mode;

}
