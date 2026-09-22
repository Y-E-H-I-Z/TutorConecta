package grupo2.com.example.tutorconectaapi.repositories;

import grupo2.com.example.tutorconectaapi.entities.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
}
