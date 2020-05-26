package com.youzhi.kkt.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class QuesVO {

    @JsonProperty("id")
    private Integer quesId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("analysis")
    private String analysis;

    @JsonProperty("bank_id")
    private Integer bankId;

    @JsonProperty("type")
    private Integer type;
}
