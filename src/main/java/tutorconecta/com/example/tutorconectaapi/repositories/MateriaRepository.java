package tutorconecta.com.example.tutorconectaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tutorconecta.com.example.tutorconectaapi.entities.Materia;

import java.util.List;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
    // Query Simple
    List<Materia> findByNivelEducativo(String nivelEducativo);
}