package com.nuc.parttimejob.dao;

import com.nuc.parttimejob.entity.LoginEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {
    int studentLogin(LoginEntity loginEntity);
}
