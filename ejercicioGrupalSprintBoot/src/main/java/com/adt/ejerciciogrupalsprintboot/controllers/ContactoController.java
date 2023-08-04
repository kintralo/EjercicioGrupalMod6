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
public class ContactoController {
    @GetMapping("/contacto")
    public String contacto(Model model){
        model.addAttribute("txtNombre","Pedro");
        model.addAttribute("txtEmail","pedro@gmail.com");
        model.addAttribute("txtMessage","Aquí un mensaje!");
        return "contactoView";
    }
}
