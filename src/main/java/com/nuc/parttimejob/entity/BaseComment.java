package com.nuc.parttimejob.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseComment {
    private int id;
    private Date bTime;
    private String bComment;
}
