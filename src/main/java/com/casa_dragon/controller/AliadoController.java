package com.casa_dragon.controller;

import com.casa_dragon.models.Aliado;
import com.casa_dragon.services.AliadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/aliado")
public class AliadoController {

    @Autowired
    private AliadoServiceImpl aliadoService;

    @PostMapping
    public ResponseEntity<?> addAliado(@RequestBody Aliado aliado) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(aliadoService.addAliado(aliado));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> listAliados () {
        try {
            return ResponseEntity.ok(aliadoService.listAliados());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping("/{aliadoId}")
    public ResponseEntity<?> listAliadoById (@PathVariable("aliadoId") Integer aliadoId) {
        try {
            return ResponseEntity.ok(aliadoService.listAliadoById(aliadoId));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(error.getMessage());
        }
    }

    @PatchMapping
    public ResponseEntity<?> updateAliado (Integer aliadoId, Aliado newAliado) {
        return null;
    }

    @DeleteMapping("/{aliadoId}")
    public ResponseEntity<?> deleteAliado (@PathVariable("aliadoId") Integer aliadoId) {
        try {
            return ResponseEntity.ok(aliadoService.deleteAliado(aliadoId));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(error.getMessage());
        }
    }

}
