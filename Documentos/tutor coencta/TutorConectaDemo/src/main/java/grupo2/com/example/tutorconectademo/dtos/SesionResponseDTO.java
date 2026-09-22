package grupo2.com.example.tutorconectademo.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SesionResponseDTO {
    private Long idSesion;
    private Long idEstudiante;
    private Long idTutor;
    private Long idMateria;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String estado;
    private String enlaceJitsi;
    private LocalDateTime fechaCreacion;
}
