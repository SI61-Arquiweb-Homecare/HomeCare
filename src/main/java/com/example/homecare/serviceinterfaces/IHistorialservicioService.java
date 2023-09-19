package com.example.homecare.serviceinterfaces;

import com.example.homecare.entities.Historialservicio;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface IHistorialservicioService {
    public void Insert(Historialservicio historialservicio);

    List<Historialservicio> list();

    public void delete(int idHistorial);

    public Optional<Historialservicio> ListarId(int idHistorial);

    List<Historialservicio>search(String observaciones);
}
