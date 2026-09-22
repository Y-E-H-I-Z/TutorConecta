package grupo2.com.example.tutorconectademo.services;

import grupo2.com.example.tutorconectademo.dtos.ReporteProgresoRequestDTO;
import grupo2.com.example.tutorconectademo.dtos.ReporteProgresoResponseDTO;

import java.util.List;

public interface ReporteProgresoService {

    ReporteProgresoResponseDTO crear(ReporteProgresoRequestDTO request);

    List<ReporteProgresoResponseDTO> listarTodos();

    ReporteProgresoResponseDTO buscarPorId(Long id);

    ReporteProgresoResponseDTO actualizar(Long id, ReporteProgresoRequestDTO request);

    void eliminar(Long id);
}
