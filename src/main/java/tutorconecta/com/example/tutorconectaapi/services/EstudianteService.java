package grupo2.com.example.tutorconectademo.services;

import grupo2.com.example.tutorconectademo.dtos.EstudianteRequestDTO;
import grupo2.com.example.tutorconectademo.dtos.EstudianteResponseDTO;

import java.util.List;

public interface EstudianteService {

    EstudianteResponseDTO crear(EstudianteRequestDTO request);

    List<EstudianteResponseDTO> listarTodos();

    EstudianteResponseDTO buscarPorId(Long id);

    EstudianteResponseDTO actualizar(Long id, EstudianteRequestDTO request);

    void eliminar(Long id);
}
