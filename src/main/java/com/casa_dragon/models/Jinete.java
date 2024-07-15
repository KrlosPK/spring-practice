package com.casa_dragon.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Jinete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombres; // máximo 50 caracteres y solo letras y espacios
    private float edad; // solo números positivos
    private Date fechaMontura; // dd/MM/YYYY

    @OneToMany(mappedBy = "jinete")
    @JsonManagedReference
    private List<Dragon> dragones;

    @OneToMany(mappedBy = "jinete")
    @JsonManagedReference
    private List<Aliado> aliados;

    public Jinete() {
    }

    public Jinete(Integer id, String nombres, float edad, Date fechaMontura) {
        this.id = id;
        this.nombres = nombres;
        this.edad = edad;
        this.fechaMontura = fechaMontura;
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

    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }

    public Date getFechaMontura() {
        return fechaMontura;
    }

    public void setFechaMontura(Date fechaMontura) {
        this.fechaMontura = fechaMontura;
    }

}
