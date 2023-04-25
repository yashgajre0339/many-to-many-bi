package com.jsp.StudentCousrebi;



import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDriverbi {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("yash");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Student student1 = new Student();
		student1.setName("yash");
		student1.setEmail("yashgajre@gmail.com");
		
		Student student2 = new Student();
		student2.setName("shrish");
		student2.setEmail("shrish@gmail.com");
		
		
		Course course1 = new Course();
		course1.setName("Java1");
		course1.setDuration("1 year");
		
		Course course2 = new Course();
		course2.setName("sql");
		course2.setDuration("3 months");
		
		Course course3= new Course();
		course3.setName("advance java");
		course3.setDuration("5 months");
		
		ArrayList<Course> a1= new ArrayList<Course>();
		a1.add(course1);
		a1.add(course2);
		a1.add(course3);
		
		ArrayList<Student> s1= new ArrayList<Student>();
		s1.add(student1);
		s1.add(student2);
		
		
		student1.setCourse(a1);
		student2.setCourse(a1);
		
		course1.setStudents(s1);
		course2.setStudents(s1);
		course3.setStudents(s1);
		
		
		
		
		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityTransaction.commit();
		
		
	}

}

