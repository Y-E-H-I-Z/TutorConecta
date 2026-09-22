package grupo2.com.example.tutorconectademo.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UsuarioResponseDTO {
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private Boolean activo;
    private LocalDateTime fechaRegistro;
    private Long idRol;
}
