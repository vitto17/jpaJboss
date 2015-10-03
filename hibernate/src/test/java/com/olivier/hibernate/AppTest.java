package com.olivier.hibernate;

import java.util.List;

import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.jpa.internal.EntityManagerFactoryImpl;
import org.springframework.orm.jpa.EntityManagerFactoryInfo;

import com.olivier.entity.Produit;
import com.olivier.entity.User;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private EntityManager entityManager;
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	//testHibernate();
    	User user = new User();
    	Produit p = new Produit();
    	p.setDescription("toto");
    	EntityManagerFactoryInfo batchProcessEntityManagerFactory = null;
		//user.setId(1);
    	//user.setNom(15);
    	//EntityManagerFactoryInfo emfi = (EntityManagerFactoryInfo)batchProcessEntityManagerFactory;
    	//EntityManagerFactory emf = emfi.getNativeEntityManagerFactory();
    	//EntityManagerFactoryImpl empImpl = (EntityManagerFactoryImpl)emf;
    	//System.out.println(empImpl.getSessionFactory().getStatistics());
    	entityManager = Persistence.createEntityManagerFactory("hibernate")
				.createEntityManager();
 
		entityManager.getTransaction().begin();
		//User user = new User(new Long(2),"Olivier VITTORI");
		//entityManager.persist(user);
		//entityManager.persist(p);
		Produit p1 = entityManager.find(Produit.class, new Long(6));
		entityManager.getTransaction().commit();
		
		Cache cache = entityManager.getEntityManagerFactory().getCache();
		if (cache.contains(Produit.class, p1.getIdProduit()))
		{
			  System.out.println("je suis ds le cache");
			} else {
				 System.out.println("jNot in cache");
			}
		Produit p2 = entityManager.find(Produit.class, new Long(6));
		entityManager.close();
    }
    
   
}
