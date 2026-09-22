package tutorconecta.com.example.tutorconectaapi.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalTime;

@Data
public class DisponibilidadHorariaRequestDTO {
    @NotNull
    private Long idTutor;

    @NotBlank
    private String diaSemana;

    @NotNull
    private LocalTime horaInicio;

    @NotNull
    private LocalTime horaFin;

    @NotNull
    private Boolean disponible;
}
