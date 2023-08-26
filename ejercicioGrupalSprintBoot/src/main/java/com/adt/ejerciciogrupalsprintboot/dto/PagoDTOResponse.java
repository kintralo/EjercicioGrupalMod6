package com.adt.ejerciciogrupalsprintboot.dto;

import com.adt.ejerciciogrupalsprintboot.models.Usuarios;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PagoDTOResponse {
    //Atributos
    private Integer id_pago;
    private Integer id_usuario;
    private Double monto;
    private LocalDate fecha_pago;
}
