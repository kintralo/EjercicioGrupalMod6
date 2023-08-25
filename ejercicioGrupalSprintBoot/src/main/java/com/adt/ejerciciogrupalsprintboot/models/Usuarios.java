package com.adt.ejerciciogrupalsprintboot.models;
import jakarta.persistence.*;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;

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
@Table(name = "usuarios")
/**
 * Creación Clase Capacitación
 */
public class Usuarios {
    //Definición de atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @Column(name = "rut", length = 12)
    private String rut;

    @Column(name = "contrasenya", length = 12)
    private String contrasenya;

    @OneToMany(mappedBy = "pago", cascade = CascadeType.ALL)
    List<Pago> pagoList;
}
