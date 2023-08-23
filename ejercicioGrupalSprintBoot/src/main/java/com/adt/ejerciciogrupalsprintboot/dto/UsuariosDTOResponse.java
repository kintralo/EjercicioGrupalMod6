package com.adt.ejerciciogrupalsprintboot.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsuariosDTOResponse {
    private Integer id;
    private String rut;
    private String nombre;
}
