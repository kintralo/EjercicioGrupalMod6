package com.adt.ejerciciogrupalsprintboot.repositories;

import com.adt.ejerciciogrupalsprintboot.models.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactoRepository extends JpaRepository<Contacto, Long> {
}
