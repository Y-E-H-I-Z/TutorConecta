package grupo2.com.example.tutorconectademo.services;

import grupo2.com.example.tutorconectademo.components.EntityMapper;
import grupo2.com.example.tutorconectademo.dtos.DisponibilidadHorariaRequestDTO;
import grupo2.com.example.tutorconectademo.dtos.DisponibilidadHorariaResponseDTO;
import grupo2.com.example.tutorconectademo.entities.DisponibilidadHoraria;
import grupo2.com.example.tutorconectademo.repositories.DisponibilidadHorariaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisponibilidadHorariaServiceImpl implements DisponibilidadHorariaService {
    private final DisponibilidadHorariaRepository repository;
    private final EntityMapper mapper;

    public DisponibilidadHorariaServiceImpl(DisponibilidadHorariaRepository repository, EntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public DisponibilidadHorariaResponseDTO crear(DisponibilidadHorariaRequestDTO request) {
        return mapper.toDisponibilidadResponseDTO(repository.save(mapper.toDisponibilidadEntity(request)));
    }

    @Override
    public List<DisponibilidadHorariaResponseDTO> listarTodos() {
        return repository.findAll().stream().map(mapper::toDisponibilidadResponseDTO).toList();
    }

    @Override
    public DisponibilidadHorariaResponseDTO buscarPorId(Long id) {
        return repository.findById(id).map(mapper::toDisponibilidadResponseDTO)
                .orElseThrow(() -> new EntityNotFoundException(
                        "No existe una disponibilidad horaria con ID: " + id));
    }

    @Override
    public DisponibilidadHorariaResponseDTO actualizar(Long id, DisponibilidadHorariaRequestDTO request) {
        buscarPorId(id);
        DisponibilidadHoraria disponibilidad = mapper.toDisponibilidadEntity(request);
        disponibilidad.setIdDisponibilidad(id);
        return mapper.toDisponibilidadResponseDTO(repository.save(disponibilidad));
    }

    @Override
    public void eliminar(Long id) {
        DisponibilidadHoraria disponibilidad = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(
                        "No existe una disponibilidad horaria con ID: " + id));
        repository.delete(disponibilidad);
    }
}
