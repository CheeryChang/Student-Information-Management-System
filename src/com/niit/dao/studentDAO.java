package com.niit.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.niit.model.student;

@Repository
public class studentDAO {
	@Resource private SessionFactory sessionFactory;
	
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
   @SuppressWarnings("unchecked")
    public List<student>getStudents(){
	   return (List<student>)this.getSession().createCriteria(student.class).list();
	  
   }
    
    
    public student getStudentById(String id) {
    	return (student)this.getSession().createQuery("from student where id=?").setParameter(0, id).uniqueResult();
    }
   
   public void addStudent(student s) {
	   this.getSession().save(s);
   }
   
   public void updateStudent(student s) {
	   this.getSession().update(s);
   }

   public void deleteStudentById(String id) {
	   this.getSession().createQuery("delete student where id=?").setParameter(0, id).executeUpdate();
}
}
