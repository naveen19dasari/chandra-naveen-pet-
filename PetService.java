package com.pets.service;

import java.util.List;

import com.pets.model.Pet;


/**

*

* @author chandrasekhar
* @author naveen

*/

public interface PetService {
	
	public List<Pet> getPetList();
    
	

  public Pet addPet(Pet pet);




}
