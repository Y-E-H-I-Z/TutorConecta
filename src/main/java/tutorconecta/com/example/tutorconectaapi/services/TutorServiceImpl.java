package grupo2.com.example.tutorconectademo.services;

import grupo2.com.example.tutorconectademo.components.EntityMapper;
import grupo2.com.example.tutorconectademo.dtos.TutorRequestDTO;
import grupo2.com.example.tutorconectademo.dtos.TutorResponseDTO;
import grupo2.com.example.tutorconectademo.entities.Tutor;
import grupo2.com.example.tutorconectademo.repositories.TutorRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorServiceImpl implements TutorService {
    private final TutorRepository repository;
    private final EntityMapper mapper;

    public TutorServiceImpl(TutorRepository repository, EntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public TutorResponseDTO crear(TutorRequestDTO request) {
        return mapper.toTutorResponseDTO(repository.save(mapper.toTutorEntity(request)));
    }

    @Override
    public List<TutorResponseDTO> listarTodos() {
        return repository.findAll().stream().map(mapper::toTutorResponseDTO).toList();
    }

    @Override
    public TutorResponseDTO buscarPorId(Long id) {
        return repository.findById(id).map(mapper::toTutorResponseDTO)
                .orElseThrow(() -> new EntityNotFoundException("No existe un tutor con ID: " + id));
    }

    @Override
    public TutorResponseDTO actualizar(Long id, TutorRequestDTO request) {
        buscarPorId(id);
        Tutor tutor = mapper.toTutorEntity(request);
        tutor.setIdTutor(id);
        return mapper.toTutorResponseDTO(repository.save(tutor));
    }

    @Override
    public void eliminar(Long id) {
        Tutor tutor = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No existe un tutor con ID: " + id));
        repository.delete(tutor);
    }
}
