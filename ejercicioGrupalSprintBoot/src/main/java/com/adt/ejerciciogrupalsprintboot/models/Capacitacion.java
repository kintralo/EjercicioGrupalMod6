package com.adt.ejerciciogrupalsprintboot.models;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalTime;

/**
 * @author Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */

@Entity
@Table(name = "capacitaciones")
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long identificador;
    @Column(name = "rut", length = 20)
    private int rut;
    @Column(name = "dia")
    private String dia;
    @Column(name = "hora")
    private LocalTime hora;
    @Column(name = "lugar", length = 40)
    private String lugar;
    @Column(name = "duracion")
    private LocalTime duracion;
    @Column(name = "cantAsistentes", length = 15)
    private int cantAsistentes;


}
