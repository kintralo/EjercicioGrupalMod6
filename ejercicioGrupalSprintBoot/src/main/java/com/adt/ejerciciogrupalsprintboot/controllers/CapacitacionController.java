package com.adt.ejerciciogrupalsprintboot.controllers;

import com.adt.ejerciciogrupalsprintboot.dto.CapacitacionDTO;
import com.adt.ejerciciogrupalsprintboot.models.Capacitacion;
import com.adt.ejerciciogrupalsprintboot.bd.Contenedor;
import com.adt.ejerciciogrupalsprintboot.services.CapacitacionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */
@Controller
public class CapacitacionController {

    @Autowired
   private CapacitacionServices capacitacionServices;

    @GetMapping("/listaCapacitaciones")
    public String getCapacitaciones(Model model) {
        System.out.println("Aqui en el lista!");
        System.out.println(Contenedor.getCapacitacionesArrayList().toString());
        List<CapacitacionDTO> capacitacionDTOS= capacitacionServices.listCapacitacion();

        model.addAttribute("listaCapacitaciones", capacitacionDTOS);
        return "listaCapacitacionesView";
    }

    @PostMapping("/saveCapacitacion")
    public String createCapacitacion(@RequestParam("txtCodigoCapacitacion") Long identificador,
                                     @RequestParam("txtRut") int rut,
                                     @RequestParam("txtDia") String dia,
                                     @RequestParam("txtHora") LocalTime hora,
                                     @RequestParam("txtLugarCapacitacion") String lugar,
                                     @RequestParam("txtDuracion") LocalTime duracion,
                                     @RequestParam("txtAsistentes") int cantAsistentes
                                     ) {
        CapacitacionDTO capacitacion = new CapacitacionDTO(identificador, rut, dia, hora, lugar, duracion, cantAsistentes);
        ///System.out.println(capacitacionServices.createCapacitacion(capacitacion).toString());
        capacitacionServices.createCapacitacion(capacitacion);
       // System.out.println(Contenedor.getCapacitacionesArrayList().get(0).toString());

        //model.addAttribute("capacitaciones", capacitacionesArrayList);
        return "/listaCapacitacionesView";
    }

    @PutMapping("/updateCapacitaciones")
    public String udpataCapacitacione(){
        return "/listaCapacitacionesView";
    }
/**
    @RequestMapping("/listaCapacitaciones")
    public String mostrarListaCapacitaciones(Model model) {
    //contenedor.getCapacitacionesArrayList();
       // model.addAttribute("capacitaciones", contenedor.getCapacitacionesArrayList());
        return "listaCapacitacionesView";
    }*/

}
