package com.example.homecare.dtos;

import com.example.homecare.entities.Usuario;

public class TrabajadorhogarDto {
    private int idTrabajador;
    private int edad_Trabajador;
    private String genero_Trabajador;
    private String descripcion_Trabajador;
    private Usuario usuario_Trabajador;

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public int getEdad_Trabajador() {
        return edad_Trabajador;
    }

    public void setEdad_Trabajador(int edad_Trabajador) {
        this.edad_Trabajador = edad_Trabajador;
    }

    public String getGenero_Trabajador() {
        return genero_Trabajador;
    }

    public void setGenero_Trabajador(String genero_Trabajador) {
        this.genero_Trabajador = genero_Trabajador;
    }

    public String getDescripcion_Trabajador() {
        return descripcion_Trabajador;
    }

    public void setDescripcion_Trabajador(String descripcion_Trabajador) {
        this.descripcion_Trabajador = descripcion_Trabajador;
    }

    public Usuario getUsuario_Trabajador() {
        return usuario_Trabajador;
    }

    public void setUsuario_Trabajador(Usuario usuario_Trabajador) {
        this.usuario_Trabajador = usuario_Trabajador;
    }
}
