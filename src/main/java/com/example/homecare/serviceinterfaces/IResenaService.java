package com.example.homecare.serviceinterfaces;


import com.example.homecare.entities.Resena;

import java.util.List;

public interface IResenaService {
    public void insert(Resena Resena);

    List<Resena> list();

    public void delete(int id);

    public Resena ListId(int id);
    public List<String>[] promedioCalificacionServicio();
}
