package com.nuc.parttimejob.dao;

import com.nuc.parttimejob.entity.JobEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SearchDao {
    // 模糊查找职位
    List<JobEntity> fuzzySearchPosition(String value);
}
