package com.example.homecare.serviceinterfaces;

import com.example.homecare.entities.Servicio;

import java.util.List;
import java.util.Optional;

public interface IServicioService {

    public void insertar(Servicio servicio);

    List<Servicio> listar();

    public void delete(int id);

    public Servicio ListId(int id);

}
