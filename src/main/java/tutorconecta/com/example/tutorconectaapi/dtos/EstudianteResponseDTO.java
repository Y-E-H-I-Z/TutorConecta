package grupo2.com.example.tutorconectaapi.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EstudianteResponseDTO {
    private Long idEstudiante;
    private Long idUsuario;
    private BigDecimal presupuestoMaximo;
}
