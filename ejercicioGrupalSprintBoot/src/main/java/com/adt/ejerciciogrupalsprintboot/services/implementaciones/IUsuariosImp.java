package com.adt.ejerciciogrupalsprintboot.services.implementaciones;
import com.adt.ejerciciogrupalsprintboot.dto.UsuariosDTOResponse;

import java.util.List;
public interface IUsuariosImp {
    public List<UsuariosDTOResponse> usuariosDTOResponseList()throws Exception;
}
