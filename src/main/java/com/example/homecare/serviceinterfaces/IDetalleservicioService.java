package com.example.homecare.serviceinterfaces;

import com.example.homecare.entities.Detalleservicio;

import java.util.List;

public interface IDetalleservicioService {
    public void insertar(Detalleservicio detalleservicio);

    List<Detalleservicio> listar();

    public Detalleservicio ListId(int id);

    public void delete(int id);
}
