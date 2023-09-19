package com.example.homecare.repositories;

import com.example.homecare.entities.Tiposervicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITiposervicioRepository extends JpaRepository<Tiposervicio, Integer>{
    List<Tiposervicio> findBynombre(String valor);
    @Query("from Tiposervicio m where m.nombre like %:nombre")
    List<Tiposervicio> search(@Param("nombre") String nombre);
}
