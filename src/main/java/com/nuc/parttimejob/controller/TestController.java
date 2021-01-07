package com.nuc.parttimejob.controller;

import com.nuc.parttimejob.entity.TestEntity;
import com.nuc.parttimejob.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demoproject/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public TestEntity test(@PathVariable Integer id) {
        System.out.println("id:" + id);
        return testService.getById(id);
    }

}