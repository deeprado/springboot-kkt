package com.youzhi.kkt.enums;

public enum QuesType {
    DANXUAN(1, "单选题"),
    DUOXUAN(2, "多选题"),
    PANDUAN(3, "判断题"),
    TIANKONG(4, "填空题"),
    WENDA(5, "问答题"),
    BUDINGX(6, "不定项题"),
    ;

    private Integer type;

    private String title;

    QuesType(Integer type, String title) {
        this.type = type;
        this.title = title;
    }
}
