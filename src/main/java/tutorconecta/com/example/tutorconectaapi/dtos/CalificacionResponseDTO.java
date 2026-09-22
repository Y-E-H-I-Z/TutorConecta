package grupo2.com.example.tutorconectademo.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CalificacionResponseDTO {
    private Long idCalificacion;
    private Long idSesion;
    private Long idTutor;
    private String nombreTutor;
    private Integer puntuacion;
    private String comentario;
    private LocalDateTime fechaCalificacion;
}
