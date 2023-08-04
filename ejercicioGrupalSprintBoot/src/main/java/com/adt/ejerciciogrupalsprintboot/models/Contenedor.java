package com.adt.ejerciciogrupalsprintboot.models;

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
    private static ArrayList<Capacitaciones>capacitacionesArrayList;

    /**
     *
     * @return capacitacionesArrayList
     */
    public static ArrayList<Capacitaciones> getCapacitacionesArrayList() {
        return capacitacionesArrayList;
    }

    /**
     *
     */
    public Contenedor(){
        this.capacitacionesArrayList=new ArrayList<Capacitaciones>();
    }

    /**
     *
     * @param capacitacion
     */
    public void addCapacitacion(Capacitaciones capacitacion){

        this.capacitacionesArrayList.add(capacitacion);
    }

    /**
     *
     * @param capacitacionesArrayList
     */
    public void setCapacitacionesArrayList(ArrayList<Capacitaciones> capacitacionesArrayList) {
        this.capacitacionesArrayList = capacitacionesArrayList;
    }

}
