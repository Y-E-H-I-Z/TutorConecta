package tutorconecta.com.example.tutorconectaapi.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PagoRequestDTO {
    @NotNull
    private Long idSesion;

    @NotNull
    @Min(0)
    private BigDecimal monto;

    @NotNull
    private LocalDateTime fechaPago;

    @NotBlank
    private String estado;

    private String metodoPago;
}
