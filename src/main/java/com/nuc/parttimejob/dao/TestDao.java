package com.nuc.parttimejob.dao;

import com.nuc.parttimejob.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    TestEntity getById(Integer id);

}