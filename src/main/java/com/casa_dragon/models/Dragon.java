package com.casa_dragon.models;

import jakarta.persistence.*;

@Entity
public class Dragon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private Integer edad;
    private float altura;

    @Column(name = "numero_victorias")
    private Integer numeroVictorias;

    @OneToMany
    Jinete jinete;

    public Dragon() {
    }

    public Dragon(Integer id, String nombre, Integer edad, float altura, Integer numeroVictorias) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.numeroVictorias = numeroVictorias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Integer getNumeroVictorias() {
        return numeroVictorias;
    }

    public void setNumeroVictorias(Integer numeroVictorias) {
        this.numeroVictorias = numeroVictorias;
    }

}
