package com.MyBatis2;

import com.MyBatis2.mapper.ParameterMapper;
import com.MyBatis2.pojo.User;
import com.MyBatis2.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testMybatis {


    @Test
    public void test1() {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(user -> System.out.println(user));

    }


    //      抛出异常
//    @Test
//    public void test2() throws Exception {
//      jdbc
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true", "root", "root");
//
////      sql
//        String username = null;
////      ${}
////        PreparedStatement preparedStatement = connection.prepareStatement("select * from user where u_name='"+username+"'");
//
////      #{}
//        PreparedStatement preparedStatement = connection.prepareStatement("select * from user where u_name=?");
//        preparedStatement.setString(1, "李")
//        System.out.println();

//    }

    @Test
    public void test3(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserByName("b");
        System.out.println(user);
    }

    @Test
    public void test4(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkUserAccount("b","1234");
        System.out.println(user);
    }

    @Test
    public void test5(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String,Object> map =new HashMap<>();
        map.put("username","1234");
        map.put("userpasswd","123");

        User user = mapper.checkUserAccountBymap(map);
        System.out.println(user);
    }

    @Test
    public void test6(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

        int user = mapper.insertUser(new User(null,"adminaa","123"));
//        System.out.println(user);
    }

    @Test
    public void test7(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);

        User user = mapper.checkUserAccountByParams("admin","123");
        System.out.println(user);
    }
}
