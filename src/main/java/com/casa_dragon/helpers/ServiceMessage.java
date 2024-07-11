package com.casa_dragon.helpers;

public enum ServiceMessage {
    DRAGON_NOT_FOUND("No se encontró el dragón en la base de datos"),
    JINETE_NOT_FOUND("No se encontró el jinete en la base de datos"),
    ALIADO_NOT_FOUND("No se encontró el aliado en la base de datos");
    ;

    private String message;

    ServiceMessage() {
    }

    ServiceMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
