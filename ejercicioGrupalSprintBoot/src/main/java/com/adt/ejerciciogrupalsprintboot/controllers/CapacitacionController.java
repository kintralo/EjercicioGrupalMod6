package com.adt.ejerciciogrupalsprintboot.controllers;

import com.adt.ejerciciogrupalsprintboot.models.Capacitaciones;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalTime;
import java.util.ArrayList;

@Controller
public class CapacitacionController {
    private ArrayList<Capacitaciones> capacitacionesArrayList = new ArrayList<Capacitaciones>();

    @GetMapping("/listaCapacitaciones")
    public String getCapacitaciones(Model model) {
        model.addAttribute("identificador", "102");
        return "listaCapacitacionesView";
    }

    @PostMapping("/saveCapacitacion")
    public String createCapacitacion(@RequestParam("txtCodigoCapacitacion") Long identificador,
                                     @RequestParam("txtRut") int rut,
                                     @RequestParam("txtDia") String dia,
                                     @RequestParam("txtHora") LocalTime hora,
                                     @RequestParam("txtLugarCapacitacion") String lugar,
                                     @RequestParam("txtDuracion") LocalTime duracion,
                                     @RequestParam("txtAsistentes") int cantAsistentes,
                                     Capacitaciones capacitaciones,Model model) {
        capacitaciones.setIdentificador(identificador);
        capacitaciones.setRut(rut);
        capacitaciones.setDia(dia);
        capacitaciones.setHora(hora);
        capacitaciones.setLugar(lugar);
        capacitaciones.setDuracion(duracion);
        capacitaciones.setCantAsistentes(cantAsistentes);
        Capacitaciones capacitacion = new Capacitaciones(identificador, rut, dia, hora, lugar, duracion, cantAsistentes);
        capacitacionesArrayList.add(capacitacion);
        model.addAttribute("capacitaciones", capacitacionesArrayList);
        return "/listaCapacitacionesView";
    }

    @PostMapping("/updateCapacitacione")
    public String udpataCapacitacione(){
        return "/listaCapacitacionesView";
    }

}
