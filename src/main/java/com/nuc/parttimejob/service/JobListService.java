package com.nuc.parttimejob.service;

import com.nuc.parttimejob.dao.JobListDao;
import com.nuc.parttimejob.entity.InsertJobEntity;
import com.nuc.parttimejob.entity.JobEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JobListService {
    @Autowired
    private JobListDao jobListDao;

    public List<JobEntity> jobList() {
        return jobListDao.jobList();
    }

    public List<JobEntity> empJobList(int id) {
        return jobListDao.empJobList(id);
    }


    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void addJob(InsertJobEntity insertJobEntity){
        jobListDao.insertJob(insertJobEntity);
        jobListDao.insertJE(insertJobEntity);
    }

}
