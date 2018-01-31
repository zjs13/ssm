package com.sxt.service;

import com.sxt.entity.Student;

public interface StudentService {

	/**
	 * 添加学生
	 * @param student  学生信息
	 * @return    是否添加成功
	 * @throws Exception
	 */
	public boolean addStudent(Student student) throws Exception;
	
	/**
	 * 根据姓名查询学生
	 * @param stuName 姓名
	 * @return 学生
	 * @throws Exception
	 */
	public Student queryStudent(String stuName) throws Exception;
}
