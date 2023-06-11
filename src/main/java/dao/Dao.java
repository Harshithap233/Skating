package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.RegDto;

public class Dao
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public void insert(RegDto dto) 
	{
		// TODO Auto-generated method stub
		et.begin();
		em.persist(dto);
		et.commit();
		
	}

}
