package com.adt.ejerciciogrupalsprintboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */

@Controller
public class InicioController {
    @GetMapping( "/")
    public String inicio(Model model){
        model.addAttribute("titulo","Bienvenido a nuestras Asesorías");
        return "index";
    }
}
