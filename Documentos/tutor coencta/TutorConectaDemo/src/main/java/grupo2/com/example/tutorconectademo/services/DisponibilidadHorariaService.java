package grupo2.com.example.tutorconectademo.services;

import grupo2.com.example.tutorconectademo.dtos.DisponibilidadHorariaRequestDTO;
import grupo2.com.example.tutorconectademo.dtos.DisponibilidadHorariaResponseDTO;

import java.util.List;

public interface DisponibilidadHorariaService {

    DisponibilidadHorariaResponseDTO crear(DisponibilidadHorariaRequestDTO request);

    List<DisponibilidadHorariaResponseDTO> listarTodos();

    DisponibilidadHorariaResponseDTO buscarPorId(Long id);

    DisponibilidadHorariaResponseDTO actualizar(Long id, DisponibilidadHorariaRequestDTO request);

    void eliminar(Long id);
}
