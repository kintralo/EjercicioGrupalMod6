package com.adt.ejerciciogrupalsprintboot.models;


import lombok.*;


import java.time.LocalTime;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * @version 1.0
 */


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
/**
 * Creación Clase Capacitación
 */
public class Capacitaciones {
    //Definición de atributos

    private Long identificador;
    private int rut;
    private String dia;
    private LocalTime hora;
    private String lugar;
    private LocalTime duracion;
    private int cantAsistentes;


}
