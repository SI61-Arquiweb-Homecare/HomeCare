package com.example.homecare.entities;

import javax.persistence.*;

@Entity
@Table(name = "Tipodocumento")
public class Tipodocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipodocumento;

    @Column(name = "descripcion", length = 250, nullable = false)
    private String descripcion;

    public Tipodocumento() {
    }

    public Tipodocumento(int idTipodocumento, String descripcion) {
        this.idTipodocumento = idTipodocumento;
        this.descripcion = descripcion;
    }

    public int getIdTipodocumento() {
        return idTipodocumento;
    }

    public void setIdTipodocumento(int idTipodocumento) {
        this.idTipodocumento = idTipodocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
