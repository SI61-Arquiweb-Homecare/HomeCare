package com.example.homecare.entities;

import javax.persistence.*;

@Entity
@Table(name = "Favorito")
public class Favorito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFavorito;

    @ManyToOne
    @JoinColumn(name = "idTrabajador",nullable = false)
    private Trabajadorhogar trabajadorhogar;

    @ManyToOne
    @JoinColumn(name = "idEmpleador",nullable = false)
    private Empleador empleador;

    public Favorito() {
    }

    public Favorito(int idFavorito, Trabajadorhogar trabajadorhogar, Empleador empleador) {
        this.idFavorito = idFavorito;
        this.trabajadorhogar = trabajadorhogar;
        this.empleador = empleador;
    }

    public int getIdFavorito() {
        return idFavorito;
    }

    public void setIdFavorito(int idFavorito) {
        this.idFavorito = idFavorito;
    }

    public Trabajadorhogar getTrabajadorhogar() {
        return trabajadorhogar;
    }

    public void setTrabajadorhogar(Trabajadorhogar trabajadorhogar) {
        this.trabajadorhogar = trabajadorhogar;
    }

    public Empleador getEmpleador() {
        return empleador;
    }

    public void setEmpleador(Empleador empleador) {
        this.empleador = empleador;
    }
}
