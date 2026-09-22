package tutorconecta.com.example.tutorconectaapi.repositories;

import tutorconecta.com.example.tutorconectaapi.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
