package com.example.donut.Entities;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public class Evento {
    private String uid;
    private String organizerName;
    private String organizerEmail;
    private String dtStamp;
    private String dtStart;
    private String dtEnd;
    private String summary;
}