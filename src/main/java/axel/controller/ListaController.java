package axel.controller;

import axel.services.VideojuegoService;
import model.Videojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/hello")
@RestController
public class ListaController {
/*
    @Autowired
    private VideojuegoService videojuegoService;

*/
    @GetMapping
    public ResponseEntity<String> hello() {
      return ResponseEntity.ok("holaaaaaa!!!!");
   }

/*
    @GetMapping("/principal")
    public ResponseEntity<List<Videojuego>> listarVideojuegos() {
        return ResponseEntity.ok(videojuegoService.buscarDestacados());
    }

    */
}
