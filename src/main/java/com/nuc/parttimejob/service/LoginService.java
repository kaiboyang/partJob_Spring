package com.nuc.parttimejob.service;

import com.nuc.parttimejob.dao.LoginDao;
import com.nuc.parttimejob.entity.LoginEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    public int studentLogin(LoginEntity loginEntity) {
        return loginDao.studentLogin(loginEntity);
    }
}
