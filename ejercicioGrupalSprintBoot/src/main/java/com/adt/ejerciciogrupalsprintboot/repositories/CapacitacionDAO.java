package com.adt.ejerciciogrupalsprintboot.repositories;

import com.adt.ejerciciogrupalsprintboot.bd.Contenedor;
import com.adt.ejerciciogrupalsprintboot.models.Capacitacion;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CapacitacionDAO implements ICapasitacionRepository{

    @Override
    public List<Capacitacion> obtenerCapacitaciones() {
        return Contenedor.getCapacitacionesArrayList();
    }

    @Override
    public boolean crearCapacitacion(Capacitacion capacitacion) {
        return Contenedor.addCapacitacion(capacitacion);
    }
}
