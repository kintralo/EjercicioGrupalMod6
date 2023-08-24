package com.adt.ejerciciogrupalsprintboot.restController;
import com.adt.ejerciciogrupalsprintboot.dto.CapacitacionDTO;
import com.adt.ejerciciogrupalsprintboot.dto.UsuariosDTOResponse;
import com.adt.ejerciciogrupalsprintboot.services.implementaciones.ICapacitacionImp;
import com.adt.ejerciciogrupalsprintboot.services.implementaciones.IUsuariosImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@org.springframework.web.bind.annotation.RestController
public class CapacitacionRestController {

    @Autowired
    private IUsuariosImp IUsuariosImp;
    @Autowired
    private ICapacitacionImp iCapacitacionImp;
    private final static Logger LOG_MONITOREO = Logger.getLogger("com.adt.ejerciciogrupalsprintboot.controllers");
    @GetMapping("/listaUsuarios")
    public ResponseEntity<List<UsuariosDTOResponse>> getUsuarios() throws Exception {
        List<UsuariosDTOResponse> objetousuarios = IUsuariosImp.usuariosDTOResponseList();
        System.out.println(objetousuarios);
        return new ResponseEntity<>(objetousuarios,HttpStatus.OK);
    }

    @GetMapping("/listaCapacitacionesRest")
    public ResponseEntity<List<CapacitacionDTO>> getCapacitaciones() throws Exception {
        List<CapacitacionDTO> getCapacitaciones = iCapacitacionImp.listCapacitacion();
        System.out.println(getCapacitaciones);
        return new ResponseEntity<>(getCapacitaciones,HttpStatus.OK);
    }
    @PostMapping("/addCapacitaionRest")
    public ResponseEntity<List<CapacitacionDTO>> addCapacitacion(@RequestBody CapacitacionDTO capacitacion){
        CapacitacionDTO add = new CapacitacionDTO(
                capacitacion.getIdentificador(),
                capacitacion.getRut(),
                capacitacion.getDia(),
                capacitacion.getHora(),
                capacitacion.getLugar(),
                capacitacion.getDuracion(),
                capacitacion.getCantAsistentes());
        List<CapacitacionDTO> listaCap = iCapacitacionImp.createCapacitacion(add);
        return new ResponseEntity<>(listaCap,HttpStatus.OK);
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