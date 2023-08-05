package com.adt.ejerciciogrupalsprintboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.logging.Logger;
import java.util.logging.Level;
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
    private final static Logger LOG_MONITOREO = Logger.getLogger("com.adt.ejerciciogrupalsprintboot.controllers");
    @GetMapping( "/")
    public String inicio(Model model){
        model.addAttribute("titulo","Bienvenido a nuestras Asesorías");
        LOG_MONITOREO.log(Level.INFO, "Nueva Solicitud de Logueo");
        return "index";
    }
}
