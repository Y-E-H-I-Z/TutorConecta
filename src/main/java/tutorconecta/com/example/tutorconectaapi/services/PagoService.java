package grupo2.com.example.tutorconectaapi.services;

import grupo2.com.example.tutorconectaapi.dtos.PagoRequestDTO;
import grupo2.com.example.tutorconectaapi.dtos.PagoResponseDTO;

import java.util.List;

public interface PagoService {

    PagoResponseDTO crear(PagoRequestDTO request);

    List<PagoResponseDTO> listarTodos();

    PagoResponseDTO buscarPorId(Long id);

    PagoResponseDTO actualizar(Long id, PagoRequestDTO request);

    void eliminar(Long id);
}
