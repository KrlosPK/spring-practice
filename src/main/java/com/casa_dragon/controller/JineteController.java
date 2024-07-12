package com.casa_dragon.controller;

import com.casa_dragon.models.Jinete;
import com.casa_dragon.services.JineteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/jinete")
public class JineteController {

    @Autowired
    private JineteServiceImpl jineteService;

    @PostMapping
    public ResponseEntity<?> addJinete(@RequestBody Jinete jinete) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(jineteService.addJinete(jinete));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> listJinetes () {
        try {
            return ResponseEntity.ok(jineteService.listJinetes());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping("/{jineteId}")
    public ResponseEntity<?> listJineteById (@PathVariable("jineteId") Integer jineteId) {
        try {
            return ResponseEntity.ok(jineteService.listJineteById(jineteId));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(error.getMessage());
        }
    }

    @PatchMapping
    public ResponseEntity<?> updateJinete (Integer jineteId, Jinete newJinete) {
        return null;
    }

    @DeleteMapping("/{jineteId}")
    public ResponseEntity<?> deleteJinete (@PathVariable("jineteId") Integer jineteId) {
        try {
            return ResponseEntity.ok(jineteService.deleteJinete(jineteId));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(error.getMessage());
        }
    }

}
