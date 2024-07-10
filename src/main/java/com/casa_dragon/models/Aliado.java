package com.casa_dragon.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aliado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombres;
    private String ubicacion;
    private double aporteMonetario;

    public Aliado() {
    }

    public Aliado(Integer id, String nombres, String ubicacion, double aporteMonetario) {
        this.id = id;
        this.nombres = nombres;
        this.ubicacion = ubicacion;
        this.aporteMonetario = aporteMonetario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getAporteMonetario() {
        return aporteMonetario;
    }

    public void setAporteMonetario(double aporteMonetario) {
        this.aporteMonetario = aporteMonetario;
    }
}
