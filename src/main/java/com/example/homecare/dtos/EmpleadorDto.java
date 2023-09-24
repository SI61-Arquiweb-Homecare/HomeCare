package com.example.homecare.dtos;

import com.example.homecare.entities.Usuario;

public class EmpleadorDto {
    private int id;

    private String descripcion_empleador;

    private Usuario usuario;

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
