package com.adt.ejerciciogrupalsprintboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CapacitacionController {
    @GetMapping("/listaCapacitaciones")
    public String  getCapacitaciones( Model model){
        model.addAttribute("identificador","102");
                return"listaCapacitaciones";
    }
}
