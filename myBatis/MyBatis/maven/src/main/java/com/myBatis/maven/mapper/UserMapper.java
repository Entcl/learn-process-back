package com.myBatis.maven.mapper;

import com.myBatis.maven.pojo.User;

import java.util.List;

public interface UserMapper {
    int adduser();
    int updateUser();

    int deleteUser();

    User selectUserById();

    List<User> getAllUser();
}
