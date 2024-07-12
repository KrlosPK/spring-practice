package com.casa_dragon.controller;

import com.casa_dragon.models.Dragon;
import com.casa_dragon.services.DragonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/dragon")
public class DragonController {

    @Autowired
    private DragonServiceImpl dragonService;

    @PostMapping
    public ResponseEntity<?> addDragon(@RequestBody Dragon dragon) {
        try {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(dragonService.addDragon(dragon));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> listDragons () {
        try {
            return ResponseEntity.ok(dragonService.listDragons());
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping("/{dragonId}")
    public ResponseEntity<?> listDragonById (@PathVariable(name = "dragonId") Integer dragonId) {
        try {
            return ResponseEntity.ok(dragonService.listDragonById(dragonId));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(error.getMessage());
        }
    }

    @PatchMapping
    public ResponseEntity<?> updateDragon (Integer dragonId, Dragon newDragon) {
        return null;
    }

    @DeleteMapping("/{dragonId}")
    public ResponseEntity<?> deleteDragon (@PathVariable("dragonId") Integer dragonId) {
        try {
            return ResponseEntity.ok(dragonService.deleteDragon(dragonId));
        } catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(error.getMessage());
        }
    }

}
