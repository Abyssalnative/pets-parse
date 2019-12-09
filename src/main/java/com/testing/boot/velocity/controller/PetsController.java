package com.testing.boot.velocity.controller;

import com.testing.boot.velocity.parser.model.Pet;
import com.testing.boot.velocity.parser.service.PetService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetsController {

    @Autowired
    private PetService petService;

    @GetMapping("/parse")
    public String getPetsTable(Model model) {
        List<Pet> pets = petService.getPets();
        model.addAttribute("pets", pets);

        return "pets";
    }

}
