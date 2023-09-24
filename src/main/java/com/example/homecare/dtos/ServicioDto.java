package com.example.homecare.dtos;

import com.example.homecare.entities.Empleador;
import com.example.homecare.entities.Tiposervicio;
import com.example.homecare.entities.Trabajadorhogar;

import java.time.LocalDate;

public class ServicioDto {
    private int idServicio;
    private int precio;
    private LocalDate fecha;
    private String descripcion;
    private LocalDate fechainicio;
    private LocalDate fechafin;
    private String direccion;
    private Trabajadorhogar trabajadorhogar;
    private Empleador empleador;
    private Tiposervicio tiposervicio;

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public Tiposervicio getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(Tiposervicio tiposervicio) {
        this.tiposervicio = tiposervicio;
    }
}
