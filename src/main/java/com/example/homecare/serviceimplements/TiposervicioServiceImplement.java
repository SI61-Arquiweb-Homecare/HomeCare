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
    public List<Tiposervicio> list(){
        return tiR.findAll();
    }

    @Override
    public void delete(int id) {
        tiR.deleteById(id);
    }

    @Override
    public Tiposervicio ListId(int idAuthor) {
        return tiR.findById(idAuthor).orElse(new Tiposervicio());
    }

}