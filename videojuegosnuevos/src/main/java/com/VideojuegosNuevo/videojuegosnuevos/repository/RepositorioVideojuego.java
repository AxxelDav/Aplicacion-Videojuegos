package com.VideojuegosNuevo.videojuegosnuevos.repository;

import com.VideojuegosNuevo.videojuegosnuevos.model.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioVideojuego extends JpaRepository<Videojuego, Integer> {

    @Query("SELECT V FROM Videojuego V ORDER BY V.nombre")
    List<Videojuego> buscarTodos();

    @Query("SELECT V FROM Videojuego V WHERE V.nombre LIKE %?1%")
    List<Videojuego> buscar(String consulta);
}
