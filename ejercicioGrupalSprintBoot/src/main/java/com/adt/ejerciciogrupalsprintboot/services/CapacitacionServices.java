package com.adt.ejerciciogrupalsprintboot.services;

import com.adt.ejerciciogrupalsprintboot.services.implementaciones.ICapacitacionImp;
import com.adt.ejerciciogrupalsprintboot.models.Capacitaciones;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */

@Service
public class CapacitacionServices implements ICapacitacionImp {


    @Override
    public Capacitaciones creatCapacitacion(Capacitaciones capacitaciones) throws Exception {
        return null;
    }

    @Override
    public Capacitaciones updateCapacitacion(long id, Capacitaciones capacitaciones) throws Exception {
        return null;
    }

    @Override
    public List<Capacitaciones> listCapacitaciones() throws Exception {
        return null;
    }

    @Override
    public Capacitaciones deleteCapacitacion(long id) throws Exception {
        return null;
    }
}
