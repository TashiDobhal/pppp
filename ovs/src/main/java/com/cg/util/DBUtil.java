package com.cg.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {

		
		
		public EntityManagerFactory  emf=Persistence.createEntityManagerFactory("JPA-PU");
			 public EntityManager em=emf.createEntityManager();
	}

