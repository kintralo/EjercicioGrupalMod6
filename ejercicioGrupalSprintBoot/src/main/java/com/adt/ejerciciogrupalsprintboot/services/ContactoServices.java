package com.adt.ejerciciogrupalsprintboot.services;

import com.adt.ejerciciogrupalsprintboot.dto.ContactoDTORequest;
import com.adt.ejerciciogrupalsprintboot.dto.ContactoDTOResponse;
import com.adt.ejerciciogrupalsprintboot.models.Contacto;
import com.adt.ejerciciogrupalsprintboot.repositories.IContactoRepository;
import com.adt.ejerciciogrupalsprintboot.services.implementaciones.IContactoImp;
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
public class ContactoServices implements IContactoImp {
    @Autowired
    private IContactoRepository iContactoRepository;

    /**
     *
     * @param contactoDTORequest
     * @return
     * @throws Exception
     */
    @Override
    public ContactoDTORequest createContacto(ContactoDTORequest contactoDTORequest) throws Exception {
        Contacto contacto= new Contacto(
                null,
                contactoDTORequest.getContacto_nombre(),
                contactoDTORequest.getContacto_email(),
                contactoDTORequest.getContacto_mensaje()
        );
        iContactoRepository.save(contacto);
         return contactoDTORequest;
    }

    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public List<ContactoDTOResponse> listContacto() throws Exception {
        List<ContactoDTOResponse> contactoDTOResponses = new ArrayList<ContactoDTOResponse>();
        for (Contacto contacto: iContactoRepository.findAll()){
            contactoDTOResponses.add(
                    new ContactoDTOResponse(
                            contacto.getId_contacto(),
                            contacto.getContacto_nombre(),
                            contacto.getContacto_email(),
                            contacto.getContacto_mensaje()
                    )
            );
        }
        return contactoDTOResponses;
    }
}
