package grupo2.com.example.tutorconectaapi.dtos;

import lombok.Data;

@Data
public class MateriaResponseDTO {
    private Long idMateria;
    private String nombre;
    private String descripcion;
    private String nivelEducativo;
}
