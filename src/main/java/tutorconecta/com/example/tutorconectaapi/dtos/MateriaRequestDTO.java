package grupo2.com.example.tutorconectaapi.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MateriaRequestDTO {
    @NotBlank
    private String nombre;

    private String descripcion;

    @NotBlank
    private String nivelEducativo;
}
