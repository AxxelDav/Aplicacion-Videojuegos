package axel.services;

import axel.repository.VideojuegoRepository;
import model.Videojuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideojuegoService {

    @Autowired
    private VideojuegoRepository videojuegoRepository;


    public List<Videojuego> findAll() {
        return videojuegoRepository.findAll();
    }

    public String metodo() {
        return "holaaaaaa";
    }

    public List<Videojuego> buscarDestacados() {
        return videojuegoRepository.buscarTodos();
    }
}
