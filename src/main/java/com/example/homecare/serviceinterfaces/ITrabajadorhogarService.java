package com.example.homecare.serviceinterfaces;

import com.example.homecare.dtos.TrabajadoredadpromedioDto;
import com.example.homecare.entities.Trabajadorhogar;

import java.util.List;
import java.util.Optional;

public interface ITrabajadorhogarService {
    public void insertar(Trabajadorhogar trabajadorhogar);
    List<Trabajadorhogar> listar();

    public void delete(int id);

    public Trabajadorhogar ListId(int id);

    public List<TrabajadoredadpromedioDto> reporte04();
}
