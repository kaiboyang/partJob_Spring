package com.nuc.parttimejob.service;


import com.nuc.parttimejob.dao.SearchDao;
import com.nuc.parttimejob.entity.JobEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {
    @Autowired
    private SearchDao searchDao;

    public List<JobEntity> fuzzySearchPosition(String value){
        return searchDao.fuzzySearchPosition(value);
    }
}
