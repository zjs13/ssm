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
     * ����ѧ��������ȷ��ѯѧ������
     * @param stuName ����
     * @return ѧ������
     */
    Student selectByStuName(String stuName);
}