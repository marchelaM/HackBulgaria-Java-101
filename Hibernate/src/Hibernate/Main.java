package Hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("resources/hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();
		/**
		 * Employee kamen = new Employee("Kamen", "Kocev", 300);
		 * session.save(kamen);
		 **/

		/**
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Employee kamen = session.get(Employee.class, 1);
			kamen.setSalary(500);
			session.update(kamen);
			tx.commit();
		} catch (HibernateException e) {

			if (tx != null) {
				
				tx.rollback();
			}
			e.printStackTrace();
		}
		**/
		/**
		List res = session.createQuery("From Employee").getResultList();
		for (int i = 0; i < res.size(); i++) {
			
			Employee emp = (Employee) res.get(i); 
			System.out.println(emp);
		}
		**/
		
		
		Transaction tx = null;
		try {
			
			tx = session.beginTransaction();
			Employee kamen = session.get(Employee.class, 1);
			session.delete(kamen);
			tx.commit();
			
		} catch (HibernateException e) {
			
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
		
		
		session.close();

	}

}
