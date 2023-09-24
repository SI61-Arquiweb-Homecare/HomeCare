package com.example.homecare.dtos;

public class TrabajadoredadpromedioDto {

    private double promedioedad;
    private int counttrabajadores;

    public TrabajadoredadpromedioDto() {
    }

    public TrabajadoredadpromedioDto(double promedioedad, int counttrabajadores) {
        this.promedioedad = promedioedad;
        this.counttrabajadores = counttrabajadores;
    }

    public double getPromedioedad() {
        return promedioedad;
    }

    public void setPromedioedad(double promedioedad) {
        this.promedioedad = promedioedad;
    }

    public int getCounttrabajadores() {
        return counttrabajadores;
    }

    public void setCounttrabajadores(int counttrabajadores) {
        this.counttrabajadores = counttrabajadores;
    }
}
