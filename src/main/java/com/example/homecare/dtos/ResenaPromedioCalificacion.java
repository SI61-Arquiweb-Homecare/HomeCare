package com.example.homecare.dtos;

import com.example.homecare.entities.Servicio;

import javax.persistence.*;

public class ResenaPromedioCalificacion {
    private Servicio servicio;
    private int promedioCalificacionServicio;

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public int getPromedioCalificacionServicio() {
        return promedioCalificacionServicio;
    }

    public void setPromedioCalificacionServicio(int promedioCalificacionServicio) {
        this.promedioCalificacionServicio = promedioCalificacionServicio;
    }
}
