package com.adt.ejerciciogrupalsprintboot.repositories;

import com.adt.ejerciciogrupalsprintboot.models.Capacitacion;

import java.util.List;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */
public interface ICapasitacionRepository {
    public List<Capacitacion> obtenerCapacitaciones();

    public boolean crearCapacitacion(Capacitacion capacitacion);

}
