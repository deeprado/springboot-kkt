package com.youzhi.kkt.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ExamVO {

    @JsonProperty("id")
    private Integer examId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("mode")
    private Integer mode;
}
