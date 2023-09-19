package com.example.homecare.serviceimplements;


import com.example.homecare.entities.Tiposervicio;
import com.example.homecare.repositories.ITiposervicioRepository;
import com.example.homecare.serviceinterfaces.ITiposervicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TiposervicioServiceImplement implements ITiposervicioService {
    @Autowired
    private ITiposervicioRepository tiR;

    @Override
    public void insert(Tiposervicio tiposervicio) {
        tiR.save(tiposervicio);
    }

    @Override
    public List<Tiposervicio> list() {
        return tiR.findAll();
    }

    @Override
    public void delete(int idTiposervicio) {
        tiR.deleteById(idTiposervicio);
    }

    @Override
    public Optional<Tiposervicio> listarId(int idTiposervicio) {
        return Optional.of(tiR.findById(idTiposervicio).orElse(new Tiposervicio()));
    }

    @Override
    public List<Tiposervicio> search(String nombre) {
        return tiR.search(nombre);
    }

}
