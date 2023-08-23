package com.adt.ejerciciogrupalsprintboot.controllers;
import com.adt.ejerciciogrupalsprintboot.dto.UsuariosDTOResponse;
import com.adt.ejerciciogrupalsprintboot.services.implementaciones.IUsuariosImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private IUsuariosImp IUsuariosImp;

    @GetMapping("/listaUsuarios")
    public ResponseEntity<List<UsuariosDTOResponse>> getUsuarios() throws Exception {
        List<UsuariosDTOResponse> objetousuarios = IUsuariosImp.usuariosDTOResponseList();
        System.out.println(objetousuarios);
        return new ResponseEntity<>(objetousuarios,HttpStatus.OK);

    }



    /*
    @GetMapping("/persona")
    public ResponseEntity<PersonaDtoResponse> getPersona(){
        PersonaDtoResponse personaDTOResponse = new PersonaDtoResponse("Laura","Sanabria","Calle 70");
        return new ResponseEntity<>(personaDTOResponse,HttpStatus.OK);
    }

    @GetMapping("/persona/{rut}/{nombre}")
    public ResponseEntity<PersonaDtoResponse> getPersonaById(@PathVariable("rut") String rut,@PathVariable("nombre") String nombre){
        PersonaDtoResponse personaDTOResponse = new PersonaDtoResponse(nombre,"Sanabria","Calle 70");
        return new ResponseEntity<>(personaDTOResponse,HttpStatus.OK);
    }

    @PostMapping("/personaParam")
    public ResponseEntity<PersonaDtoResponse> setPersona(@RequestParam String nombre,@RequestParam String apellido,@RequestParam String direccion){
        PersonaDtoResponse personaDTOResponse = new PersonaDtoResponse(nombre,apellido,direccion);
        return new ResponseEntity<>(personaDTOResponse,HttpStatus.OK);
    }

    @PostMapping("/personaBody")
    public ResponseEntity<PersonaDtoResponse> setPersonaBody(@RequestBody PersonaDtoRequest personaDtoRequest){
        PersonaDtoResponse personaDTOResponse = new PersonaDtoResponse(personaDtoRequest.getNombre(),personaDtoRequest.getApellido(),personaDtoRequest.getDireccion());
        return new ResponseEntity<>(personaDTOResponse,HttpStatus.OK);
    }*/
}