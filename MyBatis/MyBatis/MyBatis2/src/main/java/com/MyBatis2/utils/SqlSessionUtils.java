package com.MyBatis2.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SqlSessionUtils {

    public static SqlSession getSqlSession() {
        SqlSession sqlSession = null;

        try {
//        加载核心文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//        自动提交
            sqlSession = sqlSessionFactory.openSession(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return sqlSession;
    }
}
