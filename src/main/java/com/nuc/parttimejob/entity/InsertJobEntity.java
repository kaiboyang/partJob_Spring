package com.nuc.parttimejob.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsertJobEntity {
    private int jobId;
    private int empId;
    private String name;
    private Date time;
    private String require;
    private String position;
    private String money;
    private String place;
}
