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
@Table(name = "Contacto")
/**
 * Creación Clase Capacitación
 */
public class Contacto {
    //Definición de atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto")
    private Long id_contacto;

    @Column(name = "contacto_nombre", length = 120)
    private String contacto_nombre;

    @Column(name = "contacto_email", length = 60)
    private String contacto_email;

    @Column(name = "contacto_mensaje", length = 120)
    private String contacto_mensaje;


}
