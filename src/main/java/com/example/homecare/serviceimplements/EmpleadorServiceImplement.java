package com.example.homecare.serviceimplements;

import com.example.homecare.entities.Empleador;
import com.example.homecare.repositories.IEmpleadorRepository;
import com.example.homecare.serviceinterfaces.IEmpleadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadorServiceImplement implements IEmpleadorService {

    @Autowired
    private IEmpleadorRepository eR;

    @Override
    public void insert(Empleador empleador) {
        eR.save(empleador);
    }

    @Override
    public List<Empleador> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int Id) {
        eR.deleteById(Id);
    }

    @Override
    public Optional<Empleador> listarId(int Id) {
        return Optional.of(eR.findById(Id).orElse(new Empleador()));
    }

    @Override
    public List<Empleador> search(String nombre) {
        return eR.search(nombre);
    }

    @Override
    public List<Empleador> buscarnombre(String nombre) {
        return eR.findByNombre(nombre);
    }

}
