package com.example.homecare.serviceinterfaces;

import com.example.homecare.entities.Tiposervicio;

import java.util.List;


public interface ITiposervicioService {
    public void insert(Tiposervicio tiposervicio);

    List<Tiposervicio> list();

    public void delete(int idTiposervicio);

    public Tiposervicio ListId(int id);

    
}
