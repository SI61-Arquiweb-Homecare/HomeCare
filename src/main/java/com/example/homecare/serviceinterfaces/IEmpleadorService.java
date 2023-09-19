package com.example.homecare.serviceinterfaces;

import com.example.homecare.entities.Empleador;

import java.util.List;
import java.util.Optional;

public interface IEmpleadorService {
    public void insert(Empleador empleador);
    List<Empleador> list();

    public void delete (int Id);

    public Optional<Empleador>listarId(int Id);

    List<Empleador> search(String nombre);

    List<Empleador> buscarnombre(String nombre);

}
