package com.example.homecare.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    @Column(name="dni_Usuario",length = 6,nullable = false)
    private int dni_usuario;
    @Column(name="username", length = 60, nullable = false, unique = true)
    private String username;
    @Column(name="nombre_Usuario",length = 60,nullable = false)
    private String nombre_usuario;
    @Column(name="correo_Usuario",length = 60,nullable = false)
    private String correo_usuario;
    @Column(name="contrasena_Usuario",length = 60,nullable = false)
    private String contrasena_usuario;

    private Boolean enabled;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "usuario_id")
    private List<Role> roles;

    @Column(name = "rol", length = 60, nullable = false)
    private String rol;

    public Usuario() {
    }

    public Usuario(Long idUsuario, int dni_usuario, String username, String nombre_usuario, String correo_usuario, String contrasena_usuario, List<Role> roles, String rol) {
        this.idUsuario = idUsuario;
        this.dni_usuario = dni_usuario;
        this.username = username;
        this.nombre_usuario = nombre_usuario;
        this.correo_usuario = correo_usuario;
        this.contrasena_usuario = contrasena_usuario;
        this.roles = roles;
        this.rol = rol;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getDni_usuario() {
        return dni_usuario;
    }

    public void setDni_usuario(int dni_usuario) {
        this.dni_usuario = dni_usuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getContrasena_usuario() {
        return contrasena_usuario;
    }

    public void setContrasena_usuario(String contrasena_usuario) {
        this.contrasena_usuario = contrasena_usuario;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}

