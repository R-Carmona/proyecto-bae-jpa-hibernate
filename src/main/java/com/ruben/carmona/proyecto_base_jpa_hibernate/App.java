package com.ruben.carmona.proyecto_base_jpa_hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("proyecto-base-jpa-hibernate");     
    	EntityManager em = emf.createEntityManager();
    	
    	User user = new User();
    	user.setId(1);
    	user.setUserName("Rubén");
    	user.setUserMesagge("Bienvenido Rubén a Hibernate");
    	
    	    	
    	User user2 = new User();
    	user2.setId(2);
    	user2.setUserName("Isabel");
    	user2.setUserMesagge("Bienvenido Isabel a Hibernate");
    	
    	em.getTransaction().begin();
    	
    	em.persist(user);
    	em.persist(user2);    	
    	
    	//Comiteamos a la bbdd.
    	em.getTransaction().commit();
    	
    	
    	//Cerramos la session.
    	em.close();   	
    	
    }
}
