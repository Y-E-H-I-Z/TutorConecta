package grupo2.com.example.tutorconectaapi.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReporteProgresoResponseDTO {
    private Long idReporte;
    private Long idSesion;
    private Long idTutor;
    private String nombreTutor;
    private LocalDateTime fechaReporte;
    private String progreso;
    private String observaciones;
}
