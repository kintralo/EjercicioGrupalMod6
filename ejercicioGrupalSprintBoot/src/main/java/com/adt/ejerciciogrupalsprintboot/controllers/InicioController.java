package com.adt.ejerciciogrupalsprintboot.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    /*@GetMapping("/logout")
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "/index";
    }*/
    @GetMapping("/logout")
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        LOG_MONITOREO.log(Level.INFO, "Nueva Solicitud de deslogueo");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "/index"; //You can redirect wherever you want, but generally it's a good practice to show login screen again.
    }
}
