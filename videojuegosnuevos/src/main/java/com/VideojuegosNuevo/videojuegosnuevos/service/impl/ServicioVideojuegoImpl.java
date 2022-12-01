package com.VideojuegosNuevo.videojuegosnuevos.service.impl;

import com.VideojuegosNuevo.videojuegosnuevos.model.Videojuego;
import com.VideojuegosNuevo.videojuegosnuevos.repository.RepositorioVideojuego;
import com.VideojuegosNuevo.videojuegosnuevos.service.ServicioVideojuego;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicioVideojuegoImpl implements ServicioVideojuego {

    private final RepositorioVideojuego repositorioVideojuego;

    @Override
    public List<Videojuego> buscarDestacados() {
        return repositorioVideojuego.buscarTodos();
    }

    @Override
    public List<Videojuego> buscar(String consulta) {
        return repositorioVideojuego.buscar(consulta);
    }

}
