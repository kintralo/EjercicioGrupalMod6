package com.adt.ejerciciogrupalsprintboot.controllers;
import com.adt.ejerciciogrupalsprintboot.dto.PagoDTORequest;
import com.adt.ejerciciogrupalsprintboot.dto.PagoDTOResponse;
import com.adt.ejerciciogrupalsprintboot.services.implementaciones.IPagoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
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
public class PagoController {
    @Autowired
    private IPagoServices iPagoServices;

    @PostMapping
    public String createPago(@Param("")Integer usuario,
                             @RequestParam("")Double monto,
                             @RequestParam("") Date fecha_pago,
                             Model model)throws Exception{
        PagoDTORequest pagoDTORequest= new PagoDTORequest(
                usuario,monto,fecha_pago);
        iPagoServices.createPago( pagoDTORequest);
        List<PagoDTOResponse> pagoDTOResponses= iPagoServices.listPago();
        model.addAttribute("listaPago", pagoDTOResponses);
        return "/listaPagosView";
    }

    @GetMapping("/listaPagos")
    public String getPagos(Model model)throws Exception{
        List<PagoDTOResponse> pagoDTOResponses= iPagoServices.listPago();
        model.addAttribute("listaPago", pagoDTOResponses);
        return "/listaPagosView";
    }
}
