package com.example.homecare.repositories;

import com.example.homecare.entities.Trabajadorhogar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITrabajadorhogarRepository extends JpaRepository<Trabajadorhogar, Integer> {
    @Query("from Trabajadorhogar p where p.nombre like %:nombre")
    List<Trabajadorhogar> search(@Param("nombre")String nombre);
    List<Trabajadorhogar> findByNombre(String valor);
}
