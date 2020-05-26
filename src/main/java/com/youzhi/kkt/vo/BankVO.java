package com.youzhi.kkt.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BankVO {
    @JsonProperty("id")
    private Integer bankId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;
}
