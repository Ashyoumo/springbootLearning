package com.tnicy.demo.Mapper;

import com.tnicy.demo.Entity.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Date;
import java.util.List;

@Mapper
public interface ArticleMapper {
    @Select("select * from article where aid = #{aid}")
    Article findByAid(@Param("aid") Integer aid);

    @Select("select * from article")
    List<Article> findAllArticle();

    @Insert("insert into article (title, uid, username, date, content) values (#{title}, #{uid}, #{username}, #{date}, #{content})")
    void insertArticle(@Param("title") String title, @Param("uid") Integer uid, @Param("username") String username,  @Param("date") Date date, @Param("content") String content);

}
