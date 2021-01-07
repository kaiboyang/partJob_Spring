package com.nuc.parttimejob.dao;

import com.nuc.parttimejob.entity.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentDao {
    // 获取评论
    List<JobCommentEntity> JobComment(int id);

    // 修改评分
    void updateJobRate(InsertJobCommentEntity insertJobCommentEntity);

    // 添加评论
    void insertJobComment(InsertJobCommentEntity insertJobCommentEntity);

    // 获取系统评论
    List<BaseComment> selectBaseComment();

    // 添加系统评论
    void insertBaseComment(InsertBaseComment insertBaseComment);

    // 根据学生id查找评论
    List<SelectJobCommentByIdEntity> selectJobCommentById(int id);

    // 通过id删除评论内容
    void deleteJobCommentById(int id);
}
