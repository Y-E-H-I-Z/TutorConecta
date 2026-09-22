package grupo2.com.example.tutorconectademo.services;

import grupo2.com.example.tutorconectademo.components.EntityMapper;
import grupo2.com.example.tutorconectademo.dtos.ReporteProgresoRequestDTO;
import grupo2.com.example.tutorconectademo.dtos.ReporteProgresoResponseDTO;
import grupo2.com.example.tutorconectademo.entities.ReporteProgreso;
import grupo2.com.example.tutorconectademo.repositories.ReporteProgresoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteProgresoServiceImpl implements ReporteProgresoService {
    private final ReporteProgresoRepository repository;
    private final EntityMapper mapper;

    public ReporteProgresoServiceImpl(ReporteProgresoRepository repository, EntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ReporteProgresoResponseDTO crear(ReporteProgresoRequestDTO request) {
        return mapper.toReporteResponseDTO(repository.save(mapper.toReporteEntity(request)));
    }

    @Override
    public List<ReporteProgresoResponseDTO> listarTodos() {
        return repository.findAll().stream().map(mapper::toReporteResponseDTO).toList();
    }

    @Override
    public ReporteProgresoResponseDTO buscarPorId(Long id) {
        return repository.findById(id).map(mapper::toReporteResponseDTO)
                .orElseThrow(() -> new EntityNotFoundException("No existe un reporte con ID: " + id));
    }

    @Override
    public ReporteProgresoResponseDTO actualizar(Long id, ReporteProgresoRequestDTO request) {
        buscarPorId(id);
        ReporteProgreso reporte = mapper.toReporteEntity(request);
        reporte.setIdReporte(id);
        return mapper.toReporteResponseDTO(repository.save(reporte));
    }

    @Override
    public void eliminar(Long id) {
        ReporteProgreso reporte = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No existe un reporte con ID: " + id));
        repository.delete(reporte);
    }
}
