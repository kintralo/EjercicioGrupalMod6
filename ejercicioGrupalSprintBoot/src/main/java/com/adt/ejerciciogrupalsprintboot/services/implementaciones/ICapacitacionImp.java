package com.adt.ejerciciogrupalsprintboot.services.implementaciones;

import com.adt.ejerciciogrupalsprintboot.models.Capacitaciones;

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
    public Capacitaciones creatCapacitacion(Capacitaciones capacitaciones)throws Exception;
    public Capacitaciones updateCapacitacion(long id, Capacitaciones capacitaciones)throws Exception;
    public List<Capacitaciones> listCapacitaciones() throws Exception;
    public Capacitaciones deleteCapacitacion(long id) throws Exception;

}
