package com.adt.ejerciciogrupalsprintboot.services;

import com.adt.ejerciciogrupalsprintboot.dto.CapacitacionDTO;
import com.adt.ejerciciogrupalsprintboot.models.Capacitacion;
import com.adt.ejerciciogrupalsprintboot.repositories.ICapasitacionRepository;
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
    private ICapasitacionRepository capacitacionDAO;

    /**
     *
     * @param capacitacionDTO
     * @return
     */
    @Override
    public List<CapacitacionDTO> createCapacitacion(CapacitacionDTO capacitacionDTO) {
        Capacitacion capacitacion = new Capacitacion(
                capacitacionDTO.getIdentificador(),
                capacitacionDTO.getRut(),
                capacitacionDTO.getDia(),
                capacitacionDTO.getHora(),
                capacitacionDTO.getLugar(),
                capacitacionDTO.getDuracion(),
                capacitacionDTO.getCantAsistentes());

        capacitacionDAO.save(capacitacion);
        List<CapacitacionDTO> listaCapacitaciones = this.listCapacitacion();
        return listaCapacitaciones;
    }

    /**
     *
     * @param id
     * @param capacitacionDTO
     * @return
     */
    @Override
    public CapacitacionDTO updateCapacitacion(long id, CapacitacionDTO capacitacionDTO) {
        return null;
    }

    /**
     *
     * @return capacitacionDTOS
     */
    @Override
    public List<CapacitacionDTO> listCapacitacion() {
        List<CapacitacionDTO> capacitacionDTOS = new ArrayList<CapacitacionDTO>();
        for (Capacitacion capacitacion : capacitacionDAO.findAll()) {
            capacitacionDTOS.add(
                    new CapacitacionDTO(
                            capacitacion.getIdentificador(),
                            capacitacion.getRut(),
                            capacitacion.getDia(),
                            capacitacion.getHora(),
                            capacitacion.getLugar(),
                            capacitacion.getDuracion(),
                            capacitacion.getCantAsistentes()));
        }
        return capacitacionDTOS;
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public CapacitacionDTO deleteCapacitacionDTO(long id) {
        return null;
    }
}
