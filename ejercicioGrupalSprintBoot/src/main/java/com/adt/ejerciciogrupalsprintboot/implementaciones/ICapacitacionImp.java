package com.adt.ejerciciogrupalsprintboot.implementaciones;

import com.adt.ejerciciogrupalsprintboot.models.Capacitaciones;

import java.util.List;

public interface ICapacitacionImp {
    public Capacitaciones creatCapacitacion(Capacitaciones capacitaciones)throws Exception;
    public Capacitaciones updateCapacitacion(long id, Capacitaciones capacitaciones)throws Exception;
    public List<Capacitaciones> listCapacitaciones() throws Exception;
    public Capacitaciones deleteCapacitacion(long id) throws Exception;

}
