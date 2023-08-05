package com.adt.ejerciciogrupalsprintboot.repositories;

import com.adt.ejerciciogrupalsprintboot.bd.Contenedor;
import com.adt.ejerciciogrupalsprintboot.models.Capacitacion;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */
@Repository
public class CapacitacionDAO implements ICapasitacionRepository{
    /**
     *
     * @return
     */
    @Override
    public List<Capacitacion> obtenerCapacitaciones() {
        return Contenedor.getCapacitacionesArrayList();
    }

    /**
     *
     * @param capacitacion
     * @return
     */
    @Override
    public boolean crearCapacitacion(Capacitacion capacitacion) {
        System.out.println(capacitacion.getRut());
        System.out.println(capacitacion.getIdentificador());
        System.out.println(capacitacion.getDia());
        System.out.println(capacitacion.getLugar());
        System.out.println(capacitacion.getCantAsistentes());
        System.out.println(capacitacion.getHora());
        System.out.println(capacitacion.getDuracion());


        return Contenedor.addCapacitacion(capacitacion);
    }
}
