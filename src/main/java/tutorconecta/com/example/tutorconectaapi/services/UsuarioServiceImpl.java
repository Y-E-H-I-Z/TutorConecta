package grupo2.com.example.tutorconectaapi.services;

import grupo2.com.example.tutorconectaapi.components.EntityMapper;
import grupo2.com.example.tutorconectaapi.dtos.UsuarioRequestDTO;
import grupo2.com.example.tutorconectaapi.dtos.UsuarioResponseDTO;
import grupo2.com.example.tutorconectaapi.entities.Usuario;
import grupo2.com.example.tutorconectaapi.repositories.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final EntityMapper entityMapper;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository, EntityMapper entityMapper) {
        this.usuarioRepository = usuarioRepository;
        this.entityMapper = entityMapper;
    }

    @Override
    public UsuarioResponseDTO crear(UsuarioRequestDTO request) {
        Usuario usuario = entityMapper.toUsuarioEntity(request);
        return entityMapper.toUsuarioResponseDTO(usuarioRepository.save(usuario));
    }

    @Override
    public List<UsuarioResponseDTO> listarTodos() {
        return usuarioRepository.findAll().stream()
                .map(entityMapper::toUsuarioResponseDTO)
                .toList();
    }

    @Override
    public UsuarioResponseDTO buscarPorId(Long id) {
        return usuarioRepository.findById(id)
                .map(entityMapper::toUsuarioResponseDTO)
                .orElseThrow(() -> new EntityNotFoundException("No existe un usuario con ID: " + id));
    }

    @Override
    public UsuarioResponseDTO actualizar(Long id, UsuarioRequestDTO request) {
        buscarPorId(id);
        Usuario usuario = entityMapper.toUsuarioEntity(request);
        usuario.setIdUsuario(id);
        return entityMapper.toUsuarioResponseDTO(usuarioRepository.save(usuario));
    }

    @Override
    public void eliminar(Long id) {
        if (!usuarioRepository.existsById(id)) {
            throw new EntityNotFoundException("No existe un usuario con ID: " + id);
        }
        usuarioRepository.deleteById(id);
    }

}
