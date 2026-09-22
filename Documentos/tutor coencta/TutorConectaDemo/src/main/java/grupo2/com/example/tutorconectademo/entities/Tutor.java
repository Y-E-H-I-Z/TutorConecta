package grupo2.com.example.tutorconectademo.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "tutores")
public class Tutor {
    @Id
    private Long idTutor; // FK que también es PK

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_tutor")
    private Usuario usuario;

    @Column(columnDefinition = "TEXT")
    private String biografia;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal tarifaPorHora;

    private Boolean verificado;

    @Column(precision = 3, scale = 2)
    private BigDecimal calificacionPromedio;
}
