package com.tnicy.demo.Mapper;


import com.tnicy.demo.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where username = #{username}")
    User findByName(@Param("username") String username);

    @Insert("insert into user (username, password) values (#{username}, #{password})")
    void insertByNameAndPassword(@Param("username") String username, @Param("password") String password);
}
