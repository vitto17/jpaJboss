package com.olivier.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.olivier.entity.Produit;

import junit.framework.TestCase;

public class TestHibernate extends TestCase {
	 public void testHibernate(){
	    	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	    	Session session = sessionFactory.openSession();
	    	session.beginTransaction();
	    	Produit p = session.get(Produit.class,new Long(6));
	    	session.getTransaction().commit();
	    	session.close();
	    	
	    	/*Session session2 = sessionFactory.openSession();
	    	session2.beginTransaction();
	    	Produit p2 = session.get(Produit.class,new Long(6));
	    	session2.getTransaction().commit();
	    	session2.close();*/
	    	
	    }
}
