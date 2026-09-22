package grupo2.com.example.tutorconectademo.repositories;

import grupo2.com.example.tutorconectademo.entities.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MateriaRepository extends JpaRepository<Materia, Long> {
    // Query Simple
    List<Materia> findByNivelEducativo(String nivelEducativo);
}