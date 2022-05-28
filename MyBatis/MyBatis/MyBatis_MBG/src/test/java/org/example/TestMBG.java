package org.example;

import com.MyBatis_MBG.mybatis.mapper.EmpMapper;
import com.MyBatis_MBG.mybatis.pojo.Emp;
import com.MyBatis_MBG.mybatis.pojo.EmpExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class TestMBG {

    @Test
    public void test1() {
        try {
//            加载核心文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
//            自动提交
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);

//            查询所有
//            List<Emp> emps = empMapper.selectByExample(null);
//            emps.forEach(emp -> System.out.println(emp));

//            根据条件查询
//            QBC Query By Criteria
//            EmpExample example = new EmpExample();
//            example.createCriteria().andENameEqualTo("张三").andEEmailEqualTo("456@qq.com");
//            example.or().andEEmailEqualTo("123@qq.com").andENameEqualTo("张三");
//            List<Emp> emps = empMapper.selectByExample(example);
//            emps.forEach(emp -> System.out.println(emp));

//            empMapper.updateByPrimaryKey(new Emp(1,"徐凤年",1,null,"456@qq.com"));
//            empMapper.updateByPrimaryKeySelective(new Emp(1,"徐凤年",1,null,"456@qq.com"));

//            查询所有
//            page num pagesize
//            return Page
            PageHelper.startPage(1,4);
            List<Emp> emps = empMapper.selectByExample(null);
            PageInfo<Emp> page =new PageInfo<>(emps,5);
//            is.close();
//            emps.forEach(emp -> System.out.println(emp));
            System.out.println(page);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
