package com.adt.ejerciciogrupalsprintboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {
    @GetMapping( "/")
    public String inicio(Model model){
        model.addAttribute("titulo","Bienvenido a nuestras Asesorías");
        return "index";
    }
}
