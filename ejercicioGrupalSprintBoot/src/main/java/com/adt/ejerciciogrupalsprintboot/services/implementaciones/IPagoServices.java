package com.adt.ejerciciogrupalsprintboot.services.implementaciones;

import com.adt.ejerciciogrupalsprintboot.dto.PagoDTORequest;
import com.adt.ejerciciogrupalsprintboot.dto.PagoDTOResponse;

import java.util.List;

/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */
public interface IPagoServices {
    /**
     *
     * @param pagoDTORequest
     * @return
     * @throws Exception
     */
    public PagoDTORequest createPago(PagoDTORequest pagoDTORequest) throws Exception;

    /**
     *
     * @return
     * @throws Exception
     */
    public List<PagoDTOResponse> listPago() throws Exception;
}
