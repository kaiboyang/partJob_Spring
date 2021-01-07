package com.nuc.parttimejob.controller;

import com.nuc.parttimejob.entity.LoginEntity;
import com.nuc.parttimejob.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public int login(@RequestBody LoginEntity login) {
        System.out.println("login:" + login);
        return loginService.studentLogin(login);
    }

}