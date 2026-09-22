package tutorconecta.com.example.tutorconectaapi.repositories;

import tutorconecta.com.example.tutorconectaapi.entities.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {

    @Query("""
            SELECT c
            FROM Calificacion c
            JOIN FETCH c.tutor t
            WHERE t.idTutor = :idTutor
            ORDER BY c.fechaCalificacion DESC
            """)
    List<Calificacion> findCalificacionesByTutorId(@Param("idTutor") Long idTutor);
}
