package com.nuc.parttimejob.dao;

import com.nuc.parttimejob.entity.InsertJobEntity;
import com.nuc.parttimejob.entity.JEEntity;
import com.nuc.parttimejob.entity.JobEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;

@Mapper
public interface JobListDao {
    List<JobEntity> jobList();

    List<JobEntity> empJobList(int id);


    void insertJob(InsertJobEntity insertJobEntity);

    void insertJE(InsertJobEntity insertJobEntity);
}
