package com.MyBatis2.mapper;

import com.MyBatis2.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    List<User> getAllUser();

    User getUserByName(String u_name);

    User checkUserAccount(String u_name,String u_passwd);

    User checkUserAccountBymap(Map<String,Object> map);

    int insertUser(User user);

    User checkUserAccountByParams(@Param("username") String u_name,@Param("userpasswd") String u_passwd);
}
