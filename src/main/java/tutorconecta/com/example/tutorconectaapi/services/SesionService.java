package grupo2.com.example.tutorconectademo.services;

import grupo2.com.example.tutorconectademo.dtos.SesionRequestDTO;
import grupo2.com.example.tutorconectademo.dtos.SesionResponseDTO;

import java.util.List;

public interface SesionService {

    SesionResponseDTO crear(SesionRequestDTO request);

    List<SesionResponseDTO> listarTodos();

    SesionResponseDTO buscarPorId(Long id);

    SesionResponseDTO actualizar(Long id, SesionRequestDTO request);

    SesionResponseDTO actualizarEstadoSesion(Long id, String nuevoEstado);

    void eliminar(Long id);
}
