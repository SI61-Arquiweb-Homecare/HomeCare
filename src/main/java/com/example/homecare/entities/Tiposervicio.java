package com.example.homecare.entities;

import javax.persistence.*;

@Entity
@Table(name = "Tiposervicio")
public class Tiposervicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTiposervicio;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    public Tiposervicio() {
    }

    public Tiposervicio(int idTiposervicio, String nombre) {
        this.idTiposervicio = idTiposervicio;
        this.nombre = nombre;
    }

    public int getIdTiposervicio() {
        return idTiposervicio;
    }

    public void setIdTiposervicio(int idTiposervicio) {
        this.idTiposervicio = idTiposervicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
