package tutorconecta.com.example.tutorconectaapi.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "materias")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMateria;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    @Column(nullable = false)
    private String nivelEducativo;
}
