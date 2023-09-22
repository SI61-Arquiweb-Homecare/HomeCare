package com.example.homecare.repositories;

import com.example.homecare.entities.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IServicioRepository  extends JpaRepository<Servicio, Integer> {

}
