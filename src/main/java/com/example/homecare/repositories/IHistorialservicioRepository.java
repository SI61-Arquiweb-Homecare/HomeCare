package com.example.homecare.repositories;

import com.example.homecare.entities.Historialservicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHistorialservicioRepository extends JpaRepository<Historialservicio, Integer> {
    @Query("from Historialservicio h where h.observaciones like %:observaciones")
    List<Historialservicio> search(@Param("observaciones") String observaciones);
}
