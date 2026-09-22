package grupo2.com.example.tutorconectademo.dtos;

import lombok.Data;

@Data
public class MateriaResponseDTO {
    private Long idMateria;
    private String nombre;
    private String descripcion;
    private String nivelEducativo;
}
