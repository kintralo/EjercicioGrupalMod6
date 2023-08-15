package com.adt.ejerciciogrupalsprintboot.repositories;

import com.adt.ejerciciogrupalsprintboot.models.Capacitacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * @author  Juan Pablo Vásquez
 * Ándres Tapia
 * Victor Briso
 * Sebastián Araya
 * Vannya Riffo
 * @version 1.0
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICapasitacionRepository extends JpaRepository <Capacitacion, Long>{

}
