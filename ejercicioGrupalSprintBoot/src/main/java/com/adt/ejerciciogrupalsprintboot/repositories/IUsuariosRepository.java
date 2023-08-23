package com.adt.ejerciciogrupalsprintboot.repositories;


import com.adt.ejerciciogrupalsprintboot.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuariosRepository extends JpaRepository<Usuarios, Long> {
}
