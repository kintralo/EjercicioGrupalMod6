package com.adt.ejerciciogrupalsprintboot.controllers;

import com.adt.ejerciciogrupalsprintboot.dto.ContactoDTORequest;
import com.adt.ejerciciogrupalsprintboot.dto.ContactoDTOResponse;
import com.adt.ejerciciogrupalsprintboot.services.implementaciones.IContactoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
public class ContactoController {
    @Autowired
    private IContactoImp serviceContactoImp;

    @PostMapping("/saveContacto")
    public String createContacto(@RequestParam("txtNombre")String contacto_nombre,
                                     @RequestParam("txtEmail")String contacto_email,
                                     @RequestParam("txtMessage")String contacto_descripcion,
                                        Model model) throws Exception {
        ContactoDTORequest contactoDTORequest = new ContactoDTORequest(contacto_nombre,contacto_email,contacto_descripcion);
        serviceContactoImp.createContacto(contactoDTORequest);
        List<ContactoDTOResponse> contactoDTORequests = serviceContactoImp.listContacto();
        System.out.println(contactoDTORequests.size());
        model.addAttribute("listaContacto", contactoDTORequests);
        return "listaContactoView";

    }

    @GetMapping("/listaContacto")
    public String contacto(Model model) throws Exception {
        List<ContactoDTOResponse> contactoDTORequests = serviceContactoImp.listContacto();
        model.addAttribute("listaContacto", contactoDTORequests);
        return "listaContactoView";
    }

    @GetMapping("/contacto")
    public String contactoView() throws Exception {
        return "contactoView";
    }


}
