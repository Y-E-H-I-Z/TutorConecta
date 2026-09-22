package grupo2.com.example.tutorconectademo.services;

import grupo2.com.example.tutorconectademo.dtos.MateriaRequestDTO;
import grupo2.com.example.tutorconectademo.dtos.MateriaResponseDTO;

import java.util.List;

public interface MateriaService {

    MateriaResponseDTO crear(MateriaRequestDTO request);

    List<MateriaResponseDTO> listarTodos();

    MateriaResponseDTO buscarPorId(Long id);

    MateriaResponseDTO actualizar(Long id, MateriaRequestDTO request);

    void eliminar(Long id);
}
