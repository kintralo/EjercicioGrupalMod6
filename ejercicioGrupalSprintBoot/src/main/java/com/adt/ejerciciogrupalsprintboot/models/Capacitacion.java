package com.adt.ejerciciogrupalsprintboot.models;

import lombok.*;

import java.time.LocalTime;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
/**
 * Creación Clase Capacitación
 */
public class Capacitacion {
    //Definición de atributos

    private Long identificador;
    private int rut;
    private String dia;
    private LocalTime hora;
    private String lugar;
    private LocalTime duracion;
    private int cantAsistentes;


}
