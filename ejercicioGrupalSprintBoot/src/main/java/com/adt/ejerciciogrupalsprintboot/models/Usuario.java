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

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "usuario")
/**
 * Creación Clase Capacitación
 */
public class Usuario {
    //Definición de atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_usuario")
    private Long id_usuario;
    @Column(name="usuario_nombre",length = 50)
    private String nombre;
    @Column(name = "usuario_apellido")
    private String usuario_apellido;
    @Column(name = "usuario_password")
    private String usuario_password;

}
