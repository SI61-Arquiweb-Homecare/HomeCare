package com.example.homecare.serviceimplements;

import com.example.homecare.entities.Detalleservicio;
import com.example.homecare.repositories.IDetalleservicioRepository;
import com.example.homecare.serviceinterfaces.IDetalleservicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleservicioServiceImplement implements IDetalleservicioService {

    @Autowired
    private IDetalleservicioRepository deR;
    @Override
    public void insertar(Detalleservicio detalleservicio) {
        deR.save(detalleservicio);
    }
    @Override
    public List<Detalleservicio> listar() {
        return deR.findAll();
    }

    @Override
    public Detalleservicio ListId(int id) {
        return deR.findById(id).orElse(new Detalleservicio());
    }

    @Override
    public void delete(int id) {
        deR.deleteById(id);
    }
}