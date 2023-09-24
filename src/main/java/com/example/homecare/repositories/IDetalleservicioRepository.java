package com.example.homecare.repositories;

import com.example.homecare.entities.Detalleservicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleservicioRepository  extends JpaRepository<Detalleservicio, Integer> {
}
