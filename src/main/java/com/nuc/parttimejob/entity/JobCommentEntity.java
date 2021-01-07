package com.nuc.parttimejob.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobCommentEntity {
    private String name;
    private String content;
    private Date time;
}
