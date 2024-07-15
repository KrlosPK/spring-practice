package com.casa_dragon.dto;

public class AliadoDTO {

    private String nombres;
    private String ubicacion;

    public AliadoDTO() {
    }

    public AliadoDTO(String nombres, String ubicacion) {
        this.nombres = nombres;
        this.ubicacion = ubicacion;
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
}
