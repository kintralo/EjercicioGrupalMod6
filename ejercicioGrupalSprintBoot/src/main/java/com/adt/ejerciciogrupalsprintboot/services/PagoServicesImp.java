package com.adt.ejerciciogrupalsprintboot.services;

import com.adt.ejerciciogrupalsprintboot.dto.PagoDTORequest;
import com.adt.ejerciciogrupalsprintboot.dto.PagoDTOResponse;
import com.adt.ejerciciogrupalsprintboot.services.implementaciones.IPagoServices;

import java.util.List;
/**
 * @author Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */
public class PagoServicesImp implements IPagoServices {

    /**
     *
     * @param pagoDTOResponse
     * @return
     * @throws Exception
     */
    @Override
    public PagoDTORequest createPago(PagoDTOResponse pagoDTOResponse) throws Exception {
        return null;
    }

    /**
     *
     * @return
     * @throws Exception
     */
    @Override
    public List<PagoDTOResponse> listPago() throws Exception {
        return null;
    }
}
