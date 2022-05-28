package com.myBatis.maven;

import com.myBatis.maven.mapper.UserMapper;
import com.myBatis.maven.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testMybatis {

    @Test
    public void test1() throws IOException {

//        加载核心文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
//        自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.adduser();
//        int i = mapper.adduser();
//        sqlSession.commit();

//        System.out.print(i);
    }

    //    test update
    @Test
    public void test2() throws IOException {

//        加载核心文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
//        自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.updateUser();
    }

    //    deleteUser
    @Test
    public void test3() throws IOException {

//        加载核心文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
//        自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser();
    }

    //    selectUser
    @Test
    public void test4() throws IOException {

//        加载核心文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
//        自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        System.out.print(mapper.selectUserById());
    }

    //    getAllUser
    @Test
    public void test5() throws IOException {

//        加载核心文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
//        自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> list =mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
//        System.out.println(list);


//[User{u_id=16, u_name='张三'}, User{u_id=17, u_name='张三'}, User{u_id=18, u_name='张三'}, User{u_id=19, u_name='张三'}, User{u_id=20, u_name='李四'}, User{u_id=21, u_name='张三'}, User{u_id=22, u_name='张三'}]
//        System.out.print(mapper.getAllUser());

    }
}
