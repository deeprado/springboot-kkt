package com.youzhi.kkt.vo;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserVO {

    @JsonProperty("id")
    private Integer userId;

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

}
