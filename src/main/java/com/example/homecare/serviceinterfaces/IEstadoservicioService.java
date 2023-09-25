package com.example.homecare.serviceinterfaces;

import com.example.homecare.entities.Estadoservicio;
import com.example.homecare.entities.Role;

import java.util.List;

public interface IEstadoservicioService {

    public void insert(Estadoservicio estadoservicio);

    List<Estadoservicio> list();

    public Estadoservicio ListId(int id);
}
