package grupo2.com.example.tutorconectademo.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReporteProgresoRequestDTO {
    @NotNull
    private Long idSesion;

    @NotNull
    private Long idTutor;

    @NotNull
    private LocalDateTime fechaReporte;

    private String progreso;
    private String observaciones;
}
