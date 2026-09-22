package grupo2.com.example.tutorconectaapi.repositories;

import grupo2.com.example.tutorconectaapi.entities.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
    // Query Simple
    List<Materia> findByNivelEducativo(String nivelEducativo);
}