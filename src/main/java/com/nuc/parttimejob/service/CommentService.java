package com.nuc.parttimejob.service;

import com.nuc.parttimejob.dao.CommentDao;
import com.nuc.parttimejob.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentDao commentDao;

    public List<JobCommentEntity> getJobComment(int id) {
        return commentDao.JobComment(id);
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void handleInsertComment(InsertJobCommentEntity insertJobCommentEntity) {
        commentDao.updateJobRate(insertJobCommentEntity);
        commentDao.insertJobComment(insertJobCommentEntity);
    }

    public List<BaseComment> selectBaseComment() {
        return commentDao.selectBaseComment();
    }

    public void insertBaseComment(InsertBaseComment insertBaseComment){
        commentDao.insertBaseComment(insertBaseComment);
    }

    public List<SelectJobCommentByIdEntity> selectJobCommentById(int id){
        return commentDao.selectJobCommentById(id);
    }

    public void deleteJobCommentById(int id){
        commentDao.deleteJobCommentById(id);
    }
}
