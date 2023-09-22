package com.example.homecare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.homecare.entities.Estadoservicio;

@Repository
public interface IEstadoServicioRepository extends JpaRepository<Estadoservicio, Integer>{
    
}
