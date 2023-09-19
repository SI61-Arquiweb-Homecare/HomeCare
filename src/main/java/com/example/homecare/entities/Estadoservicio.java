package com.example.homecare.entities;


import javax.persistence.*;

@Entity
@Table(name = "Estadoservicio")
public class Estadoservicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstado;
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idServicio", nullable = false)
    private Servicio servicio;

    public Estadoservicio() {
    }

    public Estadoservicio(int idEstado, String nombre, Servicio servicio) {
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.servicio = servicio;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}
