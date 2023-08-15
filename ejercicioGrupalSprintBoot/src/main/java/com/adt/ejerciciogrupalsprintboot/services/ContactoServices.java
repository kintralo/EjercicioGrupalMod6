package com.adt.ejerciciogrupalsprintboot.services;

import com.adt.ejerciciogrupalsprintboot.dto.ContactoDTO;
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
     * @param contactoDTO
     * @return
     * @throws Exception
     */
    @Override
    public ContactoDTO createContacto(ContactoDTO contactoDTO) throws Exception {
        Contacto contacto= new Contacto(
                contactoDTO.getId_contacto(),
                contactoDTO.getContacto_nombre(),
                contactoDTO.getContacto_email(),
                contactoDTO.getContacto_mensaje()
        );
        iContactoRepository.save(contacto);
         return contactoDTO;
    }

    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public List<ContactoDTO> listContacto() throws Exception {
        List<ContactoDTO> contactoDTOS= new ArrayList<ContactoDTO>();
        for (Contacto contacto: iContactoRepository.findAll()){
            contactoDTOS.add(
                    new ContactoDTO(
                            contacto.getId_contacto(),
                            contacto.getContacto_nombre(),
                            contacto.getContacto_email(),
                            contacto.getContacto_mensaje()
                    )
            );
        }
        return contactoDTOS;
    }
}
