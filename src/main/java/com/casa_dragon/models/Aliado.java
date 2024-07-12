package com.casa_dragon.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Aliado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombres;
    private String ubicacion;
    private double aporteMonetario;

    @ManyToOne
    @JoinColumn(name = "fk_jinete", referencedColumnName = "id")
    @JsonBackReference
    Jinete jinete;

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
