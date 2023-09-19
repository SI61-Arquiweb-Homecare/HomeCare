package com.example.homecare.entities;

import javax.persistence.*;

@Entity
@Table(name = "Detalleservicio")
public class Detalleservicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalleservicio;

    @ManyToOne
    @JoinColumn(name = "idServicio",nullable = false)
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name = "idTipodocumento",nullable = false)
    private Tipodocumento tipodocumento;

    public Detalleservicio() {
    }

    public Detalleservicio(int idDetalleservicio, Servicio servicio, Tipodocumento tipodocumento) {
        this.idDetalleservicio = idDetalleservicio;
        this.servicio = servicio;
        this.tipodocumento = tipodocumento;
    }

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
