package com.VideojuegosNuevo.videojuegosnuevos.controller;


import com.VideojuegosNuevo.videojuegosnuevos.model.Videojuego;
import com.VideojuegosNuevo.videojuegosnuevos.service.ServicioVideojuego;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class VideojuegosController {

    private final ServicioVideojuego servicioVideojuego;

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hola Mundo!!");
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Videojuego>> listarVideojuegos() {
        return ResponseEntity.ok(servicioVideojuego.buscarDestacados());
    }


    @GetMapping("/buscar/busqueda")
    public ResponseEntity<List<Videojuego>> buscar (String consulta) {
        return ResponseEntity.ok(servicioVideojuego.buscar(consulta));
    }


}
