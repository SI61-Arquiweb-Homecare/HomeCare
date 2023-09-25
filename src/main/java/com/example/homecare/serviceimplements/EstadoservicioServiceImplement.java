package com.example.homecare.serviceimplements;


import com.example.homecare.entities.Estadoservicio;
import com.example.homecare.repositories.IEstadoservicioRepository;
import com.example.homecare.serviceinterfaces.IEstadoservicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoservicioServiceImplement implements IEstadoservicioService {
    @Autowired
    private IEstadoservicioRepository eR;

    @Override
    public void insert(Estadoservicio estadoservicio) {
        eR.save(estadoservicio);
    }

    @Override
    public List<Estadoservicio> list() {
        return eR.findAll();
    }


    @Override
    public Estadoservicio ListId(int id) {
        return eR.findById(id).orElse(new Estadoservicio());
    }
}