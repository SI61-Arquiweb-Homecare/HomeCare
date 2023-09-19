package com.example.homecare.serviceinterfaces;

import com.example.homecare.entities.Trabajadorhogar;

import java.util.List;
import java.util.Optional;

public interface ITrabajadorhogarService {
    public void insert(Trabajadorhogar trabajadorhogar);

    List<Trabajadorhogar>list();

    public void delete(int idTrabajador);

    public Optional<Trabajadorhogar> listarId(int idTrabajador);

    List<Trabajadorhogar>search(String nombre);

    List<Trabajadorhogar> buscarnombre(String nombre);
}
