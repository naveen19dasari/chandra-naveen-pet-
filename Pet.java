package com.pets.model;

import javax.persistence.Column;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**

*

* @author chandrasekhar
* @author naveen

*/
@Entity

public class Pet {

 @Id

 @GeneratedValue(strategy = GenerationType.AUTO)

 @Column(name = "petId")

    private int petId;



   

    @Column(name = "petName")

    private String petName;



    @Column(name = "petDescription")

    private String petDescription;



    @Column(name = "petCategory")

    private String petCategory;



   

    @Column(name = "petPrice")

    private double petPrice;



    @Column(name = "petStatus")

    private String petStatus;



    


    public Pet() {

    }



    public Pet(int petId, String petCategory, String petName, String petDescription, double petPrice) 
    {

        this.petId = petId;

        this.petCategory = petCategory;

        this.petName = petName;

        this.petDescription = petDescription;

        this.petPrice = petPrice;

    }    

        public int getPetId() {

        return petId;

    }



    public void setPetId(int petId) {

        this.petId = petId;

    }



    public String getPetCategory() {

        return petCategory;

    }



    public void setPetCategory(String petCategory) {

        this.petCategory = petCategory;

    }



    public String getProductName() {

        return petName;

    }



    public void setPetName(String petName) {

        this.petName = petName;

    }



    public String getPetDescription() {

        return petDescription;

    }



    public void setPetDescription(String petDescription) {

        this.petDescription = petDescription;

    }



    public double getPePrice() {

        return petPrice;

    }



    public void setPetPrice(double petPrice) {

        this.petPrice = petPrice;

    }




    @Override

    public String toString() {

        return "Pet{" + "petId=" + petId + ", petCategory=" + petCategory + ", petName=" + petName + ", petDescription=" + petDescription + ", petPrice=" + petPrice +'}';

    }



}