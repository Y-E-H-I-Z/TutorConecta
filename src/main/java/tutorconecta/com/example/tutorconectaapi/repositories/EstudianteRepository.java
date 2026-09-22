package grupo2.com.example.tutorconectaapi.repositories;

import grupo2.com.example.tutorconectaapi.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
