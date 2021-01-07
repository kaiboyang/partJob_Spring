package com.nuc.parttimejob.controller;

import com.nuc.parttimejob.entity.InsertJobEntity;
import com.nuc.parttimejob.entity.JobEntity;
import com.nuc.parttimejob.service.JobListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/list")
@CrossOrigin
public class JobListController {

    @Autowired
    private JobListService jobListService;

    @RequestMapping(value = "/jobList", method = RequestMethod.GET)
    public List<JobEntity> getList() {
        return jobListService.jobList();
    }

    @RequestMapping(value = "/empJobList/{id}", method = RequestMethod.GET)
    public List<JobEntity> getEmpJobList(@PathVariable Integer id) {
        System.out.println(id);
        return jobListService.empJobList(id);
    }

    @RequestMapping(value = "/addJob",method = RequestMethod.POST)
    public void addJob(@RequestBody InsertJobEntity insertJobEntity){
        jobListService.addJob(insertJobEntity);
    }
}