package com.adt.ejerciciogrupalsprintboot.services.implementaciones;

import com.adt.ejerciciogrupalsprintboot.dto.ContactoDTO;
import jdk.dynalink.linker.LinkerServices;

import java.util.List;

/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */

public interface IContactoImp {

    public ContactoDTO createContacto(ContactoDTO contactoDTO) throws Exception;
    public List<ContactoDTO> listContacto()throws Exception;

}
