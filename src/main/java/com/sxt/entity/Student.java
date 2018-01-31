package com.sxt.entity;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
	private Integer stuId;

	private String stuName;

	private Integer stuAge;

	private Date stuBith;

	private String stuPhoto;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer stuId, String stuName, Integer stuAge, Date stuBith,
			String stuPhoto) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuBith = stuBith;
		this.stuPhoto = stuPhoto;
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName == null ? null : stuName.trim();
	}

	public Integer getStuAge() {
		return stuAge;
	}

	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}

	public Date getStuBith() {
		return stuBith;
	}

	public void setStuBith(Date stuBith) {
		this.stuBith = stuBith;
	}

	public String getStuPhoto() {
		return stuPhoto;
	}

	public void setStuPhoto(String stuPhoto) {
		this.stuPhoto = stuPhoto;
	}

}