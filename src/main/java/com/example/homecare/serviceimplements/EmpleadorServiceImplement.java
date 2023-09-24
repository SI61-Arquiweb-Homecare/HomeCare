package com.example.homecare.serviceimplements;

import com.example.homecare.entities.Empleador;
import com.example.homecare.repositories.IEmpleadorRepository;
import com.example.homecare.serviceinterfaces.IEmpleadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmpleadorServiceImplement implements IEmpleadorService {
    @Autowired
    private IEmpleadorRepository eR;

    @Override
    public void insert(Empleador empleador) {
        eR.save(empleador);
    }

    @Override
    public List<Empleador> listar() {
        return eR.findAll();
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }

    @Override
    public Empleador ListId(int id) {
        return eR.findById(id).orElse(new Empleador());
    }

}
