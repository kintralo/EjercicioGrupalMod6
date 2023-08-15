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


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "capacitaciones")
/**
 * Creación Clase Capacitación
 */
public class Capacitacion {
    //Definición de atributos
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "identificador")
    private Long identificador;
    @Column(name = "rut")
    private Integer rut;
    @Column(name = "dia")
    private String dia;
    @Column(name = "hora")
    private LocalTime hora;
    @Column(name = "lugar", length = 40)
    private String lugar;
    @Column(name = "duracion")
    private LocalTime duracion;
    @Column(name = "cantAsistentes")
    private Integer cantAsistentes;


}
