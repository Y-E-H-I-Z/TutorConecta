package grupo2.com.example.tutorconectademo.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TutorResponseDTO {
    private Long idTutor;
    private Long idUsuario;
    private String biografia;
    private BigDecimal tarifaPorHora;
    private Boolean verificado;
    private BigDecimal calificacionPromedio;
}
