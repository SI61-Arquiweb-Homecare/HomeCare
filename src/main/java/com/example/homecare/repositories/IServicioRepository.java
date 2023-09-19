package com.example.homecare.repositories;

import com.example.homecare.entities.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IServicioRepository  extends JpaRepository<Servicio, Integer> {

}
