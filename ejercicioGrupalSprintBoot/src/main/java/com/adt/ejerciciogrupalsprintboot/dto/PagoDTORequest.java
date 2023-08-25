package com.adt.ejerciciogrupalsprintboot.dto;
import com.adt.ejerciciogrupalsprintboot.models.Usuarios;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Date;


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

    @ManyToOne()
    @JoinColumn()
    @Column(name = "cliente_id")
    private Usuarios usuarios;

    @Column(name = "id_pago")
    private Double monto;

    @Column(name = "fecha_pago")
    private Date fecha_pago;
}
