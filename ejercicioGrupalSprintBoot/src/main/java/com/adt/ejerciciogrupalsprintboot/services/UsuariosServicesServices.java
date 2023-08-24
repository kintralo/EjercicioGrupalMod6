package com.adt.ejerciciogrupalsprintboot.services;

import com.adt.ejerciciogrupalsprintboot.dto.UsuariosDTOResponse;
import com.adt.ejerciciogrupalsprintboot.models.Usuarios;
import com.adt.ejerciciogrupalsprintboot.repositories.IUsuariosRepository;
import com.adt.ejerciciogrupalsprintboot.services.implementaciones.IUsuariosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;




/**
 * @author Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */
@Service
public class UsuariosServicesServices implements IUsuariosServices {
    @Autowired
    private IUsuariosRepository IUsuarioRepository;
    @Override
    public List<UsuariosDTOResponse> usuariosDTOResponseList() throws Exception {
        List<UsuariosDTOResponse> usuariosDTOResponses = new ArrayList<UsuariosDTOResponse>();
        for (Usuarios usuario: IUsuarioRepository.findAll()){
            usuariosDTOResponses.add(
                    new UsuariosDTOResponse(
                            usuario.getId(),
                            usuario.getRut(),
                            usuario.getNombre()
                    )
            );
        }
        return usuariosDTOResponses;
    }
}
