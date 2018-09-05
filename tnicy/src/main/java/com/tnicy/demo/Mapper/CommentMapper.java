package com.tnicy.demo.Mapper;


import com.tnicy.demo.Entity.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface CommentMapper {
    @Select("select * from comment where aid = #{aid}")
    List<Comment> findAllCommentByAid(@Param("aid") Integer aid);

    @Insert("insert into comment (aid, uid, username, time, content) values (#{aid}, #{uid}, #{username}, #{time}, #{content})")
    void insertComment(@Param("aid") Integer aid, @Param("uid") Integer uid,@Param("username") String username, @Param("time")Date time, @Param("content") String content);
}
