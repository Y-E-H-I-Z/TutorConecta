package grupo2.com.example.tutorconectademo.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CalificacionRequestDTO {
    @NotNull
    private Long idSesion;

    @NotNull
    private Long idTutor;

    @NotNull
    @Min(1)
    @Max(5)
    private Integer puntuacion;

    private String comentario;

    @NotNull
    private LocalDateTime fechaCalificacion;
}
