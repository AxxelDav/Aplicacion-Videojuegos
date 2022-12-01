package axel.repository;

import model.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {

    @Query("select a from Videojuego a")
    List<Videojuego> buscarTodos();


}
