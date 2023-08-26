package com.adt.ejerciciogrupalsprintboot.controllers;

import com.adt.ejerciciogrupalsprintboot.dto.PagoDTORequest;
import com.adt.ejerciciogrupalsprintboot.dto.PagoDTOResponse;
import com.adt.ejerciciogrupalsprintboot.services.implementaciones.IPagoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * @author Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */
@Controller
public class PagoController {

    @Autowired
    private IPagoServices iPagoServices;


    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.registerCustomEditor(       Date.class,
                new CustomDateEditor(new SimpleDateFormat("dd/MM/yyyy"), true, 10));
    }

    /**
     *
     * @param usuario
     * @param monto
     * @param fecha_pago
     * @param model
     * @return
     * @throws Exception
     */
    @PostMapping("/savePago")
    public String createPago(@Param("txtUdUsuario") Integer usuario,
                             @RequestParam("txtMonto") Double monto,
                             @RequestParam("txtFecha")
                             @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fecha_pago,
                             Model model) throws Exception {
        PagoDTORequest pagoDTORequest = new PagoDTORequest(usuario, monto, fecha_pago);
        iPagoServices.createPago(pagoDTORequest);
        List<PagoDTOResponse> pagoDTOResponses = iPagoServices.listPago();
        model.addAttribute("listaPago", pagoDTOResponses);
        return "listaPagoView";
    }


    /**
     * @param model
     * @return
     * @throws Exception
     */
    @GetMapping("/listaPagos")
    public String getPagos(Model model) throws Exception {
        List<PagoDTOResponse> pagoDTOResponses = iPagoServices.listPago();
        System.out.println(pagoDTOResponses);
        model.addAttribute("listaPago", pagoDTOResponses);
        return "listaPagoView";
    }
}
