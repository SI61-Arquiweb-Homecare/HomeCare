package com.example.homecare.serviceinterfaces;

import com.example.homecare.entities.Servicio;

import java.util.List;
import java.util.Optional;

public interface IServicioService {

    public void Insert(Servicio servicio);

    List<Servicio>list();

    public void delete(int idServicio);

    public Optional<Servicio>ListarId(int idServicio);

}
