package com.example.homecare.dtos;

import com.example.homecare.entities.Servicio;
import com.example.homecare.entities.Tipodocumento;

public class DetalleservicioDto {
    private int idDetalleservicio;
    private Servicio servicio;
    private Tipodocumento tipodocumento;

    public int getIdDetalleservicio() {
        return idDetalleservicio;
    }

    public void setIdDetalleservicio(int idDetalleservicio) {
        this.idDetalleservicio = idDetalleservicio;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Tipodocumento getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(Tipodocumento tipodocumento) {
        this.tipodocumento = tipodocumento;
    }
}
