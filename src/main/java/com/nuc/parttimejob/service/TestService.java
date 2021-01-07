package com.nuc.parttimejob.service;


import com.nuc.parttimejob.dao.TestDao;
import com.nuc.parttimejob.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public TestEntity getById(Integer id) {
        return testDao.getById(id);
    }
}