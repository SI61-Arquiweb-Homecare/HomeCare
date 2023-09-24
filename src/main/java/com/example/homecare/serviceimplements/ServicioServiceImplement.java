package com.example.homecare.serviceimplements;

import com.example.homecare.entities.Servicio;
import com.example.homecare.repositories.IServicioRepository;
import com.example.homecare.serviceinterfaces.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioServiceImplement implements IServicioService {
    @Autowired
    private IServicioRepository sR;
    @Override
    public void insertar(Servicio servicio) {
        sR.save(servicio);
    }
    @Override
    public List<Servicio> listar() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public Servicio ListId(int id) {
        return sR.findById(id).orElse(new Servicio());
    }

}