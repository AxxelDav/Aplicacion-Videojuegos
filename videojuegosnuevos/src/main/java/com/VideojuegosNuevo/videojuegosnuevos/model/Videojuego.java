package com.VideojuegosNuevo.videojuegosnuevos.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "videojuego")
@AllArgsConstructor
@NoArgsConstructor
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String descripcion;
    @Column(nullable = false)
    private String imagenurl;

}
