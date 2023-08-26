package com.adt.ejerciciogrupalsprintboot.dto;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;


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
public class PagoDTORequest {

    private Integer id_Usuario;
    private Double monto;
    private LocalDate fecha_pago;
}
