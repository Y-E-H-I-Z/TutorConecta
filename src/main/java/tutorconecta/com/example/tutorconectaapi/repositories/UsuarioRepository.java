package tutorconecta.com.example.tutorconectaapi.repositories;

import tutorconecta.com.example.tutorconectaapi.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Encuentra un usuario por su email
    Usuario findByEmail(String email);

    // Obtiene todos los usuarios que tienen un rol específico (ej. "Administrador" o "Tutor")
    @Query("SELECT u FROM Usuario u JOIN u.rol r WHERE r.denominacion = :nombreRol")
    List<Usuario> findUsuariosByRolName(@Param("nombreRol") String nombreRol);
}