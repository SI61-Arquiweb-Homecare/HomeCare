package com.example.homecare.serviceimplements;

import com.example.homecare.entities.Resena;
import com.example.homecare.repositories.IResenaRepository;
import com.example.homecare.serviceinterfaces.IResenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ResenaServiceImplement implements IResenaService {

    @Autowired
    private IResenaRepository rR;

    @Override
    public void insert(Resena resena) {
        rR.save(resena);
    }

    @Override
    public List<Resena> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public Resena ListId(int id) {
        return rR.findById(id).orElse(new Resena());
    }

    @Override
    public List<String>[] promedioCalificacionServicio() {
        return rR.promedioCalificacionServicio();
    }
}
