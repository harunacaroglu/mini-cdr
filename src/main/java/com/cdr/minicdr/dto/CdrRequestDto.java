package com.cdr.minicdr.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CdrRequestDto {

    @JsonProperty("aNumber")
    private String aNumber;

    @JsonProperty("bNumber")
    private String bNumber;

    private String imsi;
    private String imei;
    private String direction;
    private String result;
    private Long setupDuration;
    private Long conversationDuration;
    private String startTime;
    private String endTime;
    private String cellId;
    private String lacId;
}

