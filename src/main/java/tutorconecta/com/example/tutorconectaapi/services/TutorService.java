package grupo2.com.example.tutorconectademo.services;

import grupo2.com.example.tutorconectademo.dtos.TutorRequestDTO;
import grupo2.com.example.tutorconectademo.dtos.TutorResponseDTO;

import java.util.List;

public interface TutorService {

    TutorResponseDTO crear(TutorRequestDTO request);

    List<TutorResponseDTO> listarTodos();

    TutorResponseDTO buscarPorId(Long id);

    TutorResponseDTO actualizar(Long id, TutorRequestDTO request);

    void eliminar(Long id);
}
