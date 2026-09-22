package tutorconecta.com.example.tutorconectaapi.repositories;

import tutorconecta.com.example.tutorconectaapi.entities.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
}
