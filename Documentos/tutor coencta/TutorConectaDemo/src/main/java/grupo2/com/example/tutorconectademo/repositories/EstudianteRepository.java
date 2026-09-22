package grupo2.com.example.tutorconectademo.repositories;

import grupo2.com.example.tutorconectademo.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
