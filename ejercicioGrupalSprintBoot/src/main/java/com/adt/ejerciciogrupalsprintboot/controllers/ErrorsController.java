package com.adt.ejerciciogrupalsprintboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ErrorsController {
    @GetMapping("/error")
    public String errorLogin(){
        return "errorView";
    }
}
