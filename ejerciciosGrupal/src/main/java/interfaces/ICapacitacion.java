package interfaces;

import models.Capacitacion;

import java.util.List;

public interface ICapacitacion {
    public boolean createCapacitacion(Capacitacion capacitacion) throws Exception;
    public boolean updateCapacitacion(Capacitacion capacitacion)throws  Exception;
    public List<Capacitacion> listaCapacitaciones();
    public boolean eliminarCapacitacion(Capacitacion capacitacion) throws Exception;

}
