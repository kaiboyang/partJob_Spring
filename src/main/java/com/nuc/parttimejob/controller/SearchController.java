package com.nuc.parttimejob.controller;

import com.nuc.parttimejob.entity.JobEntity;
import com.nuc.parttimejob.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/search")
@CrossOrigin
public class SearchController {
    @Autowired
    SearchService searchService;
    @RequestMapping(value = "/fuzzySearchPosition",method = RequestMethod.GET)
    public List<JobEntity> fuzzySearchPosition(@RequestParam String value){
        return searchService.fuzzySearchPosition(value);
    }
}
