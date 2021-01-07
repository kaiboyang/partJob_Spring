package com.nuc.parttimejob.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SelectJobCommentByIdEntity {
    private int id;
    private String content;
    private String name;
}
