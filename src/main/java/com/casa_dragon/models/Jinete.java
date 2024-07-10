package com.casa_dragon.models;

import jakarta.persistence.*;

@Entity
public class Jinete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombres;
    private float edad;
    private String fechaMontura;

    @ManyToOne
    Dragon dragon;

    public Jinete() {
    }

    public Jinete(Integer id, String nombres, float edad, String fechaMontura) {
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

    public String getFechaMontura() {
        return fechaMontura;
    }

    public void setFechaMontura(String fechaMontura) {
        this.fechaMontura = fechaMontura;
    }

}
