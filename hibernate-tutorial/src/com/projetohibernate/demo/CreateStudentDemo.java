package com.projetohibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.projetohibernate.entity.Student;
/**
 * Treinamento.
 * Fonte:  http://www.luv2code.com/
 * @author avaleriano
 *
 */
public class CreateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// create a student object
			System.out.println(" Creating new student object...");
			Student std = new Student("André","Valeriano","valleriano.andre@gmail.com");
			
			// start transaction
			session.beginTransaction();
			
			// save object student
			System.out.println("Saving the student ....");
			session.save(std);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
			
		} finally {
			factory.close();
		}

	}

}
