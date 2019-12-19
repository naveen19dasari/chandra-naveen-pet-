package com.pets.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.pets.model.Pet;

/**

*

* @author chandrasekhar
* @author naveen

*/

public class PetDaoImpl implements PetDao {
	  @Autowired

	    private SessionFactory sessionFactory;
	private List<Pet> petList;



	    public Session getSession() {

	        return sessionFactory.getCurrentSession();

	    }

	public List<Pet> getPetList() {
		 Session session = sessionFactory.getCurrentSession();

	        Query query = session.createQuery("from Pet");

	        List<Pet> productList = query.list();

	        session.flush();



	        return petList;
	}

	public Pet addPet(Pet pet) {
		 Session session = sessionFactory.getCurrentSession();

	        session.save(pet);

	        session.flush();

	        

	        return (Pet) pet;

	    }
	}


