package com.MyBatis_MBG.mybatis.mapper;

import com.MyBatis_MBG.mybatis.pojo.Dept;
import com.MyBatis_MBG.mybatis.pojo.DeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Sat May 28 10:47:48 CST 2022
     */
    int countByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Sat May 28 10:47:48 CST 2022
     */
    int deleteByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Sat May 28 10:47:48 CST 2022
     */
    int insert(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Sat May 28 10:47:48 CST 2022
     */
    int insertSelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Sat May 28 10:47:48 CST 2022
     */
    List<Dept> selectByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Sat May 28 10:47:48 CST 2022
     */
    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Sat May 28 10:47:48 CST 2022
     */
    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);
}