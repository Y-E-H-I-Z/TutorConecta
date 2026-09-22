package grupo2.com.example.tutorconectademo.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class EstudianteRequestDTO {
    @NotNull
    private Long idUsuario;

    private BigDecimal presupuestoMaximo;
}
