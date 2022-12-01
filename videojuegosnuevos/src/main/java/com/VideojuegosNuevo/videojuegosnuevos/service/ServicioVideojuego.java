package com.VideojuegosNuevo.videojuegosnuevos.service;

import com.VideojuegosNuevo.videojuegosnuevos.model.Videojuego;
import com.VideojuegosNuevo.videojuegosnuevos.service.impl.ServicioVideojuegoImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ServicioVideojuego {

    List<Videojuego> buscarDestacados();

    List<Videojuego> buscar(String Consulta);


}
