package grupo2.com.example.tutorconectademo.dtos;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PagoResponseDTO {
    private Long idPago;
    private Long idSesion;
    private String nombreTutor;
    private BigDecimal monto;
    private LocalDateTime fechaPago;
    private String estado;
    private String metodoPago;
}
