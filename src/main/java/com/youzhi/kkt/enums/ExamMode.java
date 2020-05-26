package com.youzhi.kkt.enums;


import lombok.Getter;

@Getter
public enum  ExamMode {
    NORMAL_EXAM(1, "正式考试"),
    MOCK_EXAM(2, "模拟考试"),
    TEST_EXAM(3, "模拟考试"),
    ;

    private Integer code;

    private String title;

    ExamMode(Integer code, String title) {
        this.code = code;
        this.title = title;
    }
}
