package com.adt.ejerciciogrupalsprintboot.bd;

import com.adt.ejerciciogrupalsprintboot.models.Capacitacion;

import java.util.ArrayList;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */
public class Contenedor {
    private static ArrayList<Capacitacion> capacitacionArrayList =new ArrayList<Capacitacion>();

    /**
     *
     */
    public Contenedor(){
        this.capacitacionArrayList =new ArrayList<Capacitacion>();
    }

    /**
     *
     * @param capacitacion
     */
    public static boolean addCapacitacion(Capacitacion capacitacion){

        capacitacionArrayList.add(capacitacion);

        return true;
    }
    /**
     *
     * @return capacitacionesArrayList
     */
    public static ArrayList<Capacitacion> getCapacitacionesArrayList() {
        return capacitacionArrayList;
    }

    /**
     *
     * @param capacitacionArrayList
     */
    public  void setCapacitacionesArrayList(ArrayList<Capacitacion> capacitacionArrayList) {
        this.capacitacionArrayList = capacitacionArrayList;
    }

}
