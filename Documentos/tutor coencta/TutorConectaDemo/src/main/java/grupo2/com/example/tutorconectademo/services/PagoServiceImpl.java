package grupo2.com.example.tutorconectademo.services;

import grupo2.com.example.tutorconectademo.components.EntityMapper;
import grupo2.com.example.tutorconectademo.dtos.PagoRequestDTO;
import grupo2.com.example.tutorconectademo.dtos.PagoResponseDTO;
import grupo2.com.example.tutorconectademo.entities.Pago;
import grupo2.com.example.tutorconectademo.repositories.PagoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoServiceImpl implements PagoService {
    private final PagoRepository repository;
    private final EntityMapper mapper;

    public PagoServiceImpl(PagoRepository repository, EntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public PagoResponseDTO crear(PagoRequestDTO request) {
        return mapper.toPagoResponseDTO(repository.save(mapper.toPagoEntity(request)));
    }

    @Override
    public List<PagoResponseDTO> listarTodos() {
        return repository.findAll().stream().map(mapper::toPagoResponseDTO).toList();
    }

    @Override
    public PagoResponseDTO buscarPorId(Long id) {
        return repository.findById(id).map(mapper::toPagoResponseDTO)
                .orElseThrow(() -> new EntityNotFoundException("No existe un pago con ID: " + id));
    }

    @Override
    public PagoResponseDTO actualizar(Long id, PagoRequestDTO request) {
        buscarPorId(id);
        Pago pago = mapper.toPagoEntity(request);
        pago.setIdPago(id);
        return mapper.toPagoResponseDTO(repository.save(pago));
    }

    @Override
    public void eliminar(Long id) {
        Pago pago = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No existe un pago con ID: " + id));
        repository.delete(pago);
    }
}
