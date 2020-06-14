package com.youzhi.kkt.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class StudentLoadVO {

    @JsonProperty("list")
    private List<StudentVO> list;

    @JsonProperty("loadEnd")
    private Boolean loadEnd;

}
