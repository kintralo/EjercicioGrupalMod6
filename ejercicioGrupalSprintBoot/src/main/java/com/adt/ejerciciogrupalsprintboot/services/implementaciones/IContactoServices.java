package com.adt.ejerciciogrupalsprintboot.services.implementaciones;

import com.adt.ejerciciogrupalsprintboot.dto.ContactoDTORequest;
import com.adt.ejerciciogrupalsprintboot.dto.ContactoDTOResponse;

import java.util.List;

/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */

public interface IContactoServices {

    public ContactoDTORequest createContacto(ContactoDTORequest contactoDTORequest) throws Exception;
    public List<ContactoDTOResponse> listContacto()throws Exception;


}
