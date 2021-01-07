package com.nuc.parttimejob.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobEntity {
    private int empId;
    private String empName;
    private int jobId;
    private double rate;
    private String phone;
    // 职位
    private String position;
    // 工作要求
    private String require;
    private Date time;
    private String money;
    private String place;
}
