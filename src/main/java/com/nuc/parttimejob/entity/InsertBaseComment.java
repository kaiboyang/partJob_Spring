package com.nuc.parttimejob.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsertBaseComment {
    @JsonProperty("bTime")
    private Date bTime;
    @JsonProperty("bComment")
    private String bComment;
}
