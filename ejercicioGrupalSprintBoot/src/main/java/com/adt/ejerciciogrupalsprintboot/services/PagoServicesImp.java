package com.adt.ejerciciogrupalsprintboot.services;

import com.adt.ejerciciogrupalsprintboot.dto.PagoDTORequest;
import com.adt.ejerciciogrupalsprintboot.dto.PagoDTOResponse;
import com.adt.ejerciciogrupalsprintboot.models.Pago;
import com.adt.ejerciciogrupalsprintboot.repositories.IPagoRepository;
import com.adt.ejerciciogrupalsprintboot.services.implementaciones.IPagoServices;
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
public class PagoServicesImp implements IPagoServices {
    @Autowired
    private IPagoRepository iPagoRepository;

    /**
     * @param pagoDTORequest
     * @return pagoDTORequest
     * @throws Exception
     */
    @Override
    public PagoDTORequest createPago(PagoDTORequest pagoDTORequest) throws Exception {
        Pago pago = new Pago(
                null,
                pagoDTORequest.getUsuarios(),
                pagoDTORequest.getMonto(),
                pagoDTORequest.getFecha_pago()
        );
        iPagoRepository.save(pago);
        return pagoDTORequest;
    }

    /**
     * @return pagoDTOResponses
     * @throws Exception
     */
    @Override
    public List<PagoDTOResponse> listPago() throws Exception {
        List<PagoDTOResponse> pagoDTOResponses = new ArrayList<PagoDTOResponse>();
        for (Pago pago : iPagoRepository.findAll()) {
            pagoDTOResponses.add(
                    new PagoDTOResponse(
                            pago.getId_pago(),
                            pago.getUsuarios(),
                            pago.getMonto(),
                            pago.getFecha_pago()
                    )
            );
        }
        return pagoDTOResponses;
    }
}
