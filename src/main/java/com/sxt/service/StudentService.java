package com.sxt.service;

import com.sxt.entity.Student;

public interface StudentService {

	/**
	 * ���ѧ��
	 * @param student  ѧ����Ϣ
	 * @return    �Ƿ���ӳɹ�
	 * @throws Exception
	 */
	public boolean addStudent(Student student) throws Exception;
	
	/**
	 * ����������ѯѧ��
	 * @param stuName ����
	 * @return ѧ��
	 * @throws Exception
	 */
	public Student queryStudent(String stuName) throws Exception;
}
