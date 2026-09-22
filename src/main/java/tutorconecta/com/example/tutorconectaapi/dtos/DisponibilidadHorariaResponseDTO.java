package tutorconecta.com.example.tutorconectaapi.dtos;

import lombok.Data;

import java.time.LocalTime;

@Data
public class DisponibilidadHorariaResponseDTO {
    private Long idDisponibilidad;
    private Long idTutor;
    private String nombreTutor;
    private String diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Boolean disponible;
}
