package grupo2.com.example.tutorconectademo.services;

import grupo2.com.example.tutorconectademo.components.EntityMapper;
import grupo2.com.example.tutorconectademo.dtos.SesionRequestDTO;
import grupo2.com.example.tutorconectademo.dtos.SesionResponseDTO;
import grupo2.com.example.tutorconectademo.entities.Sesion;
import grupo2.com.example.tutorconectademo.repositories.SesionRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SesionServiceImpl implements SesionService {
    private final SesionRepository sesionRepository;
    private final EntityMapper entityMapper;

    public SesionServiceImpl(SesionRepository sesionRepository, EntityMapper entityMapper) {
        this.sesionRepository = sesionRepository;
        this.entityMapper = entityMapper;
    }

    @Override
    public SesionResponseDTO crear(SesionRequestDTO request) {
        Sesion sesion = entityMapper.toSesionEntity(request);
        return entityMapper.toSesionResponseDTO(sesionRepository.save(sesion));
    }

    @Override
    public List<SesionResponseDTO> listarTodos() {
        return sesionRepository.findAll().stream()
                .map(entityMapper::toSesionResponseDTO)
                .toList();
    }

    @Override
    public SesionResponseDTO buscarPorId(Long id) {
        return sesionRepository.findById(id)
                .map(entityMapper::toSesionResponseDTO)
                .orElseThrow(() -> new EntityNotFoundException("No existe una sesion con ID: " + id));
    }

    @Override
    public SesionResponseDTO actualizar(Long id, SesionRequestDTO request) {
        buscarPorId(id);
        Sesion sesion = entityMapper.toSesionEntity(request);
        sesion.setIdSesion(id);
        return entityMapper.toSesionResponseDTO(sesionRepository.save(sesion));
    }

    @Override
    public SesionResponseDTO actualizarEstadoSesion(Long id, String nuevoEstado) {
        Sesion sesion = sesionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No existe una sesion con ID: " + id));
        sesion.setEstado(nuevoEstado);
        return entityMapper.toSesionResponseDTO(sesionRepository.save(sesion));
    }

    @Override
    public void eliminar(Long id) {
        if (!sesionRepository.existsById(id)) {
            throw new EntityNotFoundException("No existe una sesion con ID: " + id);
        }
        sesionRepository.deleteById(id);
    }

}
