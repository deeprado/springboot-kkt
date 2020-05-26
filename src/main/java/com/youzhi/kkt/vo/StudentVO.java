package com.youzhi.kkt.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StudentVO {

    @JsonProperty("id")
    private Integer stuId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("mobile")
    private String mobile;


}
