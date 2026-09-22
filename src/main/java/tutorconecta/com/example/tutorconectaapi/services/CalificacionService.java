package grupo2.com.example.tutorconectaapi.services;

import grupo2.com.example.tutorconectaapi.dtos.CalificacionRequestDTO;
import grupo2.com.example.tutorconectaapi.dtos.CalificacionResponseDTO;

import java.util.List;

public interface CalificacionService {

    CalificacionResponseDTO crear(CalificacionRequestDTO request);

    List<CalificacionResponseDTO> listarTodos();

    CalificacionResponseDTO buscarPorId(Long id);

    CalificacionResponseDTO actualizar(Long id, CalificacionRequestDTO request);

    void eliminar(Long id);
}
