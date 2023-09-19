package com.example.homecare.entities;

import javax.persistence.*;

@Entity
@Table(name = "Resena")
public class Resena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResena;

    @Column(name = "calificacion", length = 10,nullable = false)
    private int calificacion;

    @Column(name = "descripcion", length = 250, nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idServicio",nullable = false)
    private Servicio servicio;

    public Resena() {
    }

    public Resena(int idResena, int calificacion, String descripcion, Servicio servicio) {
        this.idResena = idResena;
        this.calificacion = calificacion;
        this.descripcion = descripcion;
        this.servicio = servicio;
    }

    public int getIdResena() {
        return idResena;
    }

    public void setIdResena(int idResena) {
        this.idResena = idResena;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}
