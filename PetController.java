package com.pets.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pets.model.Pet;
import com.pets.service.PetService;

/**

*

* @author chandrasekhar
* @author naveen

*/

@Controller

@RequestMapping("/pet")

public class PetController {



    @Autowired

    private PetService petService;
    
   

    @RequestMapping("/pet/addPet")

    public ModelAndView addPet(ModelMap model, Pet pet) {



        model.addAttribute("pet", new Pet());



        return new ModelAndView("addPet", "command", new Pet());

    }
 

    @RequestMapping("/allPets/all")

    public String getPets(Model model) {

        List<Pet> pets = petService.getPetList();

        model.addAttribute("pets", pets);



        return "viewOrder";

    }



   

    }

