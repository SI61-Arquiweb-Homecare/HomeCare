package com.example.homecare.dtos;

public class UsuarioRolDto {
    private int countusuarios;
    private String rol;

    public UsuarioRolDto() {
    }

    public UsuarioRolDto(int countusuarios) {
        this.countusuarios = countusuarios;
    }

    public int getCountusuarios() {
        return countusuarios;
    }

    public void setCountusuarios(int countusuarios) {
        this.countusuarios = countusuarios;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
