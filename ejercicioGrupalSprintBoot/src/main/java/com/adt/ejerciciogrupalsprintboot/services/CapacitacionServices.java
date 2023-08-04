package com.adt.ejerciciogrupalsprintboot.services;

import com.adt.ejerciciogrupalsprintboot.dto.CapacitacionDTO;
import com.adt.ejerciciogrupalsprintboot.models.Capacitacion;
import com.adt.ejerciciogrupalsprintboot.repositories.CapacitacionDAO;
import com.adt.ejerciciogrupalsprintboot.services.implementaciones.ICapacitacionImp;
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
public class CapacitacionServices implements ICapacitacionImp {

     @Autowired
    private CapacitacionDAO capacitacionDAO;

    @Override
    public CapacitacionDTO createCapacitacion(CapacitacionDTO capacitacionDTO) {
        Capacitacion capacitacion= new Capacitacion(
                capacitacionDTO.getIdentificador(),capacitacionDTO.getRut(),
                capacitacionDTO.getDia(),capacitacionDTO.getHora(),capacitacionDTO.getLugar(),capacitacionDTO.getDuracion(),
                capacitacionDTO.getCantAsistentes());

         capacitacionDAO.crearCapacitacion(capacitacion);
        return capacitacionDTO;
    }

    @Override
    public CapacitacionDTO updateCapacitacion(long id, CapacitacionDTO capacitacionDTO)  {
        return null;
    }

    @Override
    public List<CapacitacionDTO> listCapacitacion() {
        List<CapacitacionDTO> capacitacionDTOS= new ArrayList<CapacitacionDTO>();
        for(Capacitacion capacitacion: capacitacionDAO.obtenerCapacitaciones() ){
            capacitacionDTOS.add(new CapacitacionDTO( capacitacion.getIdentificador(),capacitacion.getRut(),
                    capacitacion.getDia(),capacitacion.getHora(),capacitacion.getLugar(),capacitacion.getDuracion(),
                    capacitacion.getCantAsistentes()));
        }
        return capacitacionDTOS;
    }

    @Override
    public CapacitacionDTO deleteCapacitacionDTO(long id)  {
        return null;
    }
}
