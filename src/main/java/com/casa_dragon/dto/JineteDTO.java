package com.casa_dragon.dto;

public class JineteDTO {

    private String nombres;
    private float edad;

    public JineteDTO() {
    }

    public JineteDTO(String nombres, float edad) {
        this.nombres = nombres;
        this.edad = edad;
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
}
