package com.nuc.parttimejob.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsertJobCommentEntity {
    private int stuId;
    private int jobId;
    private double rate;
    private String content;
}
