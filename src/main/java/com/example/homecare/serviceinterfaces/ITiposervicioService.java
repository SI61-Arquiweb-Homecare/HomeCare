package com.example.homecare.serviceinterfaces;

import com.example.homecare.entities.Tiposervicio;

import java.util.List;
import java.util.Optional;

public interface ITiposervicioService {
    public void insert(Tiposervicio tiposervicio);
    List<Tiposervicio> list();

    public void delete(int id);

    public Tiposervicio ListId(int id);
}

