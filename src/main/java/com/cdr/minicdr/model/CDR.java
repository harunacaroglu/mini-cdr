package com.cdr.minicdr.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CDR {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "a_number")
    private String aNumber;

    @Column(name = "b_number")
    private String bNumber;

    @Column(name = "imsi")
    private String imsi;

    @Column(name = "imei")
    private String imei;

    @Column(name = "direction")
    private String direction;

    @Column(name = "result")
    private String result;

    @Column(name = "setup_duration")
    private Long setupDuration;

    @Column(name = "conversation_duration")
    private Long conversationDuration;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "end_time")
    private String endTime;

    @Column(name = "cell_id")
    private String cellId;

    @Column(name = "lac_id")
    private String lacId;
}
