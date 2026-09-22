package grupo2.com.example.tutorconectaapi.services;

import grupo2.com.example.tutorconectaapi.dtos.UsuarioRequestDTO;
import grupo2.com.example.tutorconectaapi.dtos.UsuarioResponseDTO;

import java.util.List;

public interface UsuarioService {

    UsuarioResponseDTO crear(UsuarioRequestDTO request);

    List<UsuarioResponseDTO> listarTodos();

    UsuarioResponseDTO buscarPorId(Long id);

    UsuarioResponseDTO actualizar(Long id, UsuarioRequestDTO request);

    void eliminar(Long id);
}
