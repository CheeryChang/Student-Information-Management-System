package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name="studentInformation")
public class student {
  private String studentID;
  
  private String name;
  
  private String major;
  
  private String classNo;
  
  @Id
  @Column(name="id",nullable=false,length=32,unique=true)
  @GenericGenerator(name="generator",strategy="uuid.hex")
  @GeneratedValue(generator="generator")
  public String getStudentID() {
	return studentID;
}

public void setStudentID(String studentID) {
	this.studentID = studentID;
}

@Column(name="name",nullable=false,length=32)

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Column(name="major",nullable=false,length=32)

public String getMajor() {
	return major;
}

public void setMajor(String major) {
	this.major = major;
}

@Column(name="classNo",nullable=false,length=32)

public String getClassNo() {
	return classNo;
}

public void setClassNo(String classNo) {
	this.classNo = classNo;
}


}
