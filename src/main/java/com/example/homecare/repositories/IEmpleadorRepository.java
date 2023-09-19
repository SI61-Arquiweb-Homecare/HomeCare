package com.example.homecare.repositories;

import com.example.homecare.entities.Empleador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmpleadorRepository extends JpaRepository<Empleador, Integer> {
   @Query("from Empleador e where e.nombre like %:nombre")
    List<Empleador> search(@Param("nombre")String nombre);
    List<Empleador> findByNombre(String valor);
}
