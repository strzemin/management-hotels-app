package com.github.strzemin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.strzemin.db.entity.Parking;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



@SpringBootApplication
public class AppConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(AppConfiguration.class, args);
		
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hotels");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	
	Parking parking =new Parking();
	parking.setId(1L);
	parking.setMarka("Gazik");
	parking.setModel("ab");
	parking.setNumer_rejstracyjny("zkl");
	
	
	entityManager.getTransaction().begin();
	entityManager.persist(parking);
	entityManager.getTransaction().commit();
	
	
	
	
	
	
	entityManager.close();
	entityManagerFactory.close();
		
		
		
		
		
		
		
		
		
	
	}
		
}
