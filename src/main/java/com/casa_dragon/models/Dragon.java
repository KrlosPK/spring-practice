package com.casa_dragon.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Dragon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre; // máximo 20 caracteres y solo letras y espacios
    private Integer edad; // solo números positivos y máximo 2000
    private float altura; // solo números positivos

    @Column(name = "numero_victorias")
    private Integer numeroVictorias; // solo números positivos

    @ManyToOne
    @JoinColumn(name = "fk_jinete", referencedColumnName = "id")
    @JsonBackReference
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
