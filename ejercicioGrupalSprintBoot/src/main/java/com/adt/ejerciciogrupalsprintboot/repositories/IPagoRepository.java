package com.adt.ejerciciogrupalsprintboot.repositories;

import com.adt.ejerciciogrupalsprintboot.models.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */
@Repository
public interface IPagoRepository extends JpaRepository<Pago, Integer> {
}
