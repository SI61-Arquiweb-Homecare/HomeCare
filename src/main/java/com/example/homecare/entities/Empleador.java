package com.example.homecare.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "Empleador")
public class Empleador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Descripcion_Empleador",length = 200,nullable = false)
    private String descripcion_empleador;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Usuario_id")
    private Usuario usuario;

    public Empleador() {
    }

    public Empleador(int id, String descripcion_empleador, Usuario usuario) {
        this.id = id;
        this.descripcion_empleador = descripcion_empleador;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion_empleador() {
        return descripcion_empleador;
    }

    public void setDescripcion_empleador(String descripcion_empleador) {
        this.descripcion_empleador = descripcion_empleador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
