package com.example.homecare.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;

    @Column(name = "precio", length = 20, nullable = false)
    private int precio;
    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;
    @Column(name = "descripcion", length = 200, nullable = false)
    private String descripcion;
    @Column(name = "fechainicio",nullable = true)
    private LocalDate fechainicio;
    @Column(name = "fechafin",nullable = true)
    private LocalDate fechafin;
    @Column(name = "direccion", length = 100, nullable = false)
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "idTrabajador",nullable = false)
    private Trabajadorhogar trabajadorhogar;

    @ManyToOne
    @JoinColumn(name = "idEmpleador",nullable = false)
    private Empleador empleador;

    @ManyToOne
    @JoinColumn(name = "idTiposervicio",nullable = false)
    private Tiposervicio tiposervicio;

    public Servicio() {
    }

    public Servicio(int idServicio, int precio, LocalDate fecha, String descripcion, LocalDate fechainicio, LocalDate fechafin, String direccion, Trabajadorhogar trabajadorhogar, Empleador empleador, Tiposervicio tiposervicio) {
        this.idServicio = idServicio;
        this.precio = precio;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.direccion = direccion;
        this.trabajadorhogar = trabajadorhogar;
        this.empleador = empleador;
        this.tiposervicio = tiposervicio;
    }

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
