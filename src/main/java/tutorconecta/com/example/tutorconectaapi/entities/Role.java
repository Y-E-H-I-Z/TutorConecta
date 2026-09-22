package grupo2.com.example.tutorconectademo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @Column(nullable = false, length = 50)
    private String denominacion;

    @Column(columnDefinition = "TEXT")
    private String descripcion;
}
