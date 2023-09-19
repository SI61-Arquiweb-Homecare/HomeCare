package com.example.homecare.entities;

import javax.persistence.*;

@Entity
@Table(name = "Trabajador")

public class Trabajadorhogar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTrabajador;
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "apellido", length = 40, nullable = false)
    private String apellido;
    @Column(name = "dni", length = 8, nullable = false)
    private int dni;
    @Column(name = "genero", length = 1, nullable = false)
    private String genero;
    @Column(name = "edad", length = 3, nullable = false)
    private int edad;
    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;

    public Trabajadorhogar() {
    }

    public Trabajadorhogar(int idTrabajador, String nombre, String apellido, int dni, String genero, int edad, String direccion) {
        this.idTrabajador = idTrabajador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
