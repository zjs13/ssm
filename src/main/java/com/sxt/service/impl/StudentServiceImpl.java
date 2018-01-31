package com.sxt.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sxt.dao.StudentDao;
import com.sxt.entity.Student;
import com.sxt.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Resource(name="studentDao")
	private StudentDao studentDao;
	
	public boolean addStudent(Student student) throws Exception {
		return studentDao.insertSelective(student) > 0 ? true : false;
	}
	
	public Student queryStudent(String stuName) throws Exception {
		return studentDao.selectByStuName(stuName);
	}
}
