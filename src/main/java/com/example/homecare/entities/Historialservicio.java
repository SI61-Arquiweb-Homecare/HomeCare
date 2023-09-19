package com.example.homecare.entities;

import javax.persistence.*;

@Entity
@Table(name = "Historialservicio")
public class Historialservicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHistorial;

    @Column(name = "observaciones", length = 250, nullable = false)
    private String observaciones;
    @ManyToOne
    @JoinColumn(name = "idServicio", nullable = false)
    private Servicio servicio;

    public Historialservicio() {
    }

    public Historialservicio(int idHistorial, String observaciones, Servicio servicio) {
        this.idHistorial = idHistorial;
        this.observaciones = observaciones;
        this.servicio = servicio;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}
