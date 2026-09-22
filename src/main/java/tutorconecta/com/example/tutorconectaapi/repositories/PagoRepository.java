package tutorconecta.com.example.tutorconectaapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tutorconecta.com.example.tutorconectaapi.entities.Pago;

public interface PagoRepository extends JpaRepository<Pago, Long> {
}
