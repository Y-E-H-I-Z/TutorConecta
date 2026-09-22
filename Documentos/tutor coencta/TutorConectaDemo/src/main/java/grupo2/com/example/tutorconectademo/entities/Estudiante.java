package grupo2.com.example.tutorconectademo.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    private Long idEstudiante; // FK que también es PK

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_estudiante")
    private Usuario usuario;

    @Column(precision = 10, scale = 2)
    private BigDecimal presupuestoMaximo;
}