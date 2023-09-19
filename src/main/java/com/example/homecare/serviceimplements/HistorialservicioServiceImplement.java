package com.example.homecare.serviceimplements;

import com.example.homecare.entities.Historialservicio;
import com.example.homecare.repositories.IHistorialservicioRepository;
import com.example.homecare.serviceinterfaces.IHistorialservicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistorialservicioServiceImplement implements IHistorialservicioService {
    @Autowired
    private IHistorialservicioRepository hR;
    @Override
    public void Insert(Historialservicio historialservicio) {
        hR.save(historialservicio);
    }

    @Override
    public List<Historialservicio> list() {
        return hR.findAll();
    }

    @Override
    public void delete(int idHistorial) {
        hR.deleteById(idHistorial);
    }

    @Override
    public Optional<Historialservicio> ListarId(int idHistorial) {
        return Optional.of(hR.findById(idHistorial).orElse(new Historialservicio()));
    }

    @Override
    public List<Historialservicio> search(String observaciones) {
        return hR.search(observaciones);
    }
}
