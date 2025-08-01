package com.cdr.minicdr.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CDR {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String aNumber;
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
