package com.adt.ejerciciogrupalsprintboot.dto;

import com.adt.ejerciciogrupalsprintboot.models.Usuarios;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PagoDTOResponse {
    private Integer id_pago;

    @ManyToOne()
    @JoinColumn()
    @Column(name = "cliente_id")
    private Usuarios usuarios;

    @Column(name = "id_pago")
    private Double monto;
    @Column(name = "fecha_pago")
    private Date fecha_pago;
}
