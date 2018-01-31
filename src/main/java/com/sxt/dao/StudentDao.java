package com.sxt.dao;

import com.sxt.entity.Student;

public interface StudentDao {
    int deleteByPrimaryKey(Integer stuId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stuId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    /**
     * 根据学生姓名精确查询学生对象
     * @param stuName 姓名
     * @return 学生对象
     */
    Student selectByStuName(String stuName);
}