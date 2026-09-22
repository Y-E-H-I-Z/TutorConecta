package grupo2.com.example.tutorconectademo.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EstudianteResponseDTO {
    private Long idEstudiante;
    private Long idUsuario;
    private BigDecimal presupuestoMaximo;
}
