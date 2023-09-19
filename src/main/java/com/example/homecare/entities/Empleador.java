package com.example.homecare.entities;

import javax.persistence.*;

@Entity
@Table(name = "Empleador")
public class Empleador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleador;
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;
    @Column(name = "edad", length = 3, nullable = false)
    private int edad;
    @Column(name = "correo", length = 30, nullable = false)
    private String correo;
    @Column(name = "telefono", length = 9, nullable = false)
    private int telefono;
    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;

    public Empleador() {
    }

    public Empleador(int idEmpleador, String nombre, String apellido, int edad, String correo, int telefono, String direccion) {
        this.idEmpleador = idEmpleador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getIdEmpleador() {
        return idEmpleador;
    }

    public void setIdEmpleador(int idEmpleador) {
        this.idEmpleador = idEmpleador;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
