package grupo2.com.example.tutorconectaapi.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SesionRequestDTO {
    @NotNull
    private Long idEstudiante;

    @NotNull
    private Long idTutor;

    @NotNull
    private Long idMateria;

    @NotNull
    private LocalDateTime fechaInicio;

    @NotNull
    private LocalDateTime fechaFin;

    @NotBlank
    private String estado;

    private String enlaceJitsi;
    private LocalDateTime fechaCreacion;
}
