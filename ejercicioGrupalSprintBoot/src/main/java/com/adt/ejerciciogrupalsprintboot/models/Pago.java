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
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Date;

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
@Table(name = "pago")
/**
 * Creación Clase Capacitación
 */
public class Pago {
    //Definición de atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private Integer id;
    @Column(name = "cliente_id")
    private Integer cliente_id;
    @Column(name = "id_pago")
    private Double monto;
    @Column(name = "fecha_pago")
    private Date fecha_pago;

}
