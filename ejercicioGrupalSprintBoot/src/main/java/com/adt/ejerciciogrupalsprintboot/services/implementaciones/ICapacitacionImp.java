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
    public CapacitacionDTO createCapacitacion(CapacitacionDTO capacitacionDTO);
    public CapacitacionDTO updateCapacitacion(long id, CapacitacionDTO capacitacionDTO);
    public List<CapacitacionDTO> listCapacitacion() ;
    public CapacitacionDTO deleteCapacitacionDTO(long id) ;

}
