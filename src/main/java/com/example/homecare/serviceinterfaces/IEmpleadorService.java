package com.example.homecare.serviceinterfaces;

import com.example.homecare.entities.Empleador;

import java.util.List;
import java.util.Optional;

public interface IEmpleadorService {
    public void insert(Empleador empleador);

    List<Empleador> listar();

    public void delete(int id);

    public Empleador ListId(int id);

}
