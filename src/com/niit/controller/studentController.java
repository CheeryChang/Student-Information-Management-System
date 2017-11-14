package com.niit.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.model.student;
import com.niit.service.studentService;

@Controller
@RequestMapping(value="/s")
public class studentController {
	
	@Autowired private studentService sS;
	
	
	@RequestMapping(value="/getStudents")
	@ResponseBody
   public List<student>getStudents(){
	   return sS.getStudents();
   }
   
   @RequestMapping(value="/getStudentById")
	@ResponseBody
   public student getStudentById(String id){
	   return sS.getStudentById(id);
   }
   
   @RequestMapping(value="/addStudent")
   public void addStudent(student s) {
	   sS.addStudent(s);
   }
   
   @RequestMapping(value="/updateStudent")
   public void updateStudent(student s) {
	   sS.updateStudent(s);
   }

   @RequestMapping(value="/deleteStudent")
   public void deleteStudentById(String id) {
	   sS.deleteStudentById(id);
}
}
