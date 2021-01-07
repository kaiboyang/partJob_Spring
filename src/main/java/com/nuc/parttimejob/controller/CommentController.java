package com.nuc.parttimejob.controller;

import com.nuc.parttimejob.entity.*;
import com.nuc.parttimejob.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

import java.util.List;

@RestController
@RequestMapping("/comment")
@CrossOrigin
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/jobComment/{id}", method = RequestMethod.GET)
    public List<JobCommentEntity> getJobComment(@PathVariable Integer id) {
        return commentService.getJobComment(id);
    }

    @RequestMapping(value = "/addComment", method = RequestMethod.POST)
    public void handleInsertComment(@RequestBody InsertJobCommentEntity insertJobCommentEntity) {
        System.out.println(insertJobCommentEntity);
        commentService.handleInsertComment(insertJobCommentEntity);
    }

    @RequestMapping(value = "/selectBaseComment", method = RequestMethod.GET)
    public List<BaseComment> selectBaseComment() {
        return commentService.selectBaseComment();
    }

    @RequestMapping(value = "/insertBaseComment", method = RequestMethod.POST)
    public void getTest(@RequestBody InsertBaseComment insertBaseComment) {
        commentService.insertBaseComment(insertBaseComment);
    }

    @RequestMapping(value = "/selectJobCommentById/{id}",method = RequestMethod.GET)
    public List<SelectJobCommentByIdEntity> selectJobCommentById(@PathVariable int id){
        return commentService.selectJobCommentById(id);
    }

    @DeleteMapping("/deleteJobCommentById/{id}")
    public void deleteJobCommentById(@PathVariable int id){
        commentService.deleteJobCommentById(id);
    }
}