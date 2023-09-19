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
    public void Insert(Servicio servicio) {sR.save(servicio);}

    @Override
    public List<Servicio> list() {return sR.findAll();}

    @Override
    public void delete(int idServicio) {sR.deleteById(idServicio);}

    @Override
    public Optional<Servicio> ListarId(int idServicio){
        return Optional.of(sR.findById(idServicio).orElse(new Servicio()));
    }

}
