package com.pets.dao;

import java.util.List;


/**

*

* @author chandrasekhar
* @author naveen

*/

import com.pets.model.Pet;

public interface PetDao {
	
	public List<Pet> getPetList();
    public Pet addPet(Pet pet);






    

}


