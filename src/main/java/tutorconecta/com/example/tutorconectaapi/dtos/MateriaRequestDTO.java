package tutorconecta.com.example.tutorconectaapi.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class MateriaRequestDTO {
    @NotBlank
    @Size(max = 100)
    private String nombre;

    private String descripcion;

    @NotBlank
    private String nivelEducativo;
}
