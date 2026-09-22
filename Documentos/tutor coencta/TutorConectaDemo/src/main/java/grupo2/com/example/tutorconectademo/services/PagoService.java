package grupo2.com.example.tutorconectademo.services;

import grupo2.com.example.tutorconectademo.dtos.PagoRequestDTO;
import grupo2.com.example.tutorconectademo.dtos.PagoResponseDTO;

import java.util.List;

public interface PagoService {

    PagoResponseDTO crear(PagoRequestDTO request);

    List<PagoResponseDTO> listarTodos();

    PagoResponseDTO buscarPorId(Long id);

    PagoResponseDTO actualizar(Long id, PagoRequestDTO request);

    void eliminar(Long id);
}
