package com.challengeSpringSecurity.challengeSpringSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShieldController {

    @GetMapping("/")
    public String greeting(){
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String assemble(){
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String[] secretBases(){

        String[] secretBases = {"Bordeaux", "Biarritz", "La Loupe 🌲", "Lille", "Lyon", "Marseille", "Nantes", "ect"};

        return secretBases;
    }
}
