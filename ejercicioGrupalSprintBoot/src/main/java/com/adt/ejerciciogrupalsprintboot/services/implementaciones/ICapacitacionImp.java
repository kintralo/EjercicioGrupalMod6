package com.adt.ejerciciogrupalsprintboot.services.implementaciones;

import com.adt.ejerciciogrupalsprintboot.dto.CapacitacionDTO;


import java.util.List;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */
public interface ICapacitacionImp {
    /**
     *
     * @param capacitacionDTO
     * @return
     */
    public CapacitacionDTO createCapacitacion(CapacitacionDTO capacitacionDTO);

    /**
     *
     * @param id
     * @param capacitacionDTO
     * @return
     */
    public CapacitacionDTO updateCapacitacion(long id, CapacitacionDTO capacitacionDTO);

    /**
     *
     * @return
     */
    public List<CapacitacionDTO> listCapacitacion() ;

    /**
     *
     * @param id
     * @return
     */
    public CapacitacionDTO deleteCapacitacionDTO(long id) ;

}
