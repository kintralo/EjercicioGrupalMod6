package com.adt.ejerciciogrupalsprintboot.controllers;

import com.adt.ejerciciogrupalsprintboot.models.Capacitaciones;
import com.adt.ejerciciogrupalsprintboot.models.Contenedor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.ArrayList;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */
@Controller
public class CapacitacionController {
    private ArrayList<Capacitaciones> capacitacionesArrayList = new ArrayList<Capacitaciones>();
    private Contenedor contenedor= new Contenedor();
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
        contenedor.addCapacitacion(capacitacion);
        //model.addAttribute("capacitaciones", capacitacionesArrayList);
        return "/listaCapacitacionesView";
    }

    @PutMapping("/updateCapacitaciones")
    public String udpataCapacitacione(){
        return "/listaCapacitacionesView";
    }

    @RequestMapping("/listaCapacitaciones")
    public String mostrarListaCapacitaciones(Model model) {
    //contenedor.getCapacitacionesArrayList();
        model.addAttribute("capacitaciones", contenedor.getCapacitacionesArrayList());
        return "listaCapacitacionesView";
    }

}
