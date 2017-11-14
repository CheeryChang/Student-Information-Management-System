package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.studentDAO;
import com.niit.model.student;

@Service
public class studentService {
		
	   @Autowired private studentDAO sD;
	   public List<student>getStudents(){
		   return sD.getStudents();
	   }
	   
	   public student getStudentById(String id) {
		   return sD.getStudentById(id);
	   }
	   
	   public void addStudent(student s) {
		   sD.addStudent(s);
	   }
	   
	   public void updateStudent(student s) {
		   sD.updateStudent(s);
	   }

	   public void deleteStudentById(String id) {
		   sD.deleteStudentById(id);
	}
}


