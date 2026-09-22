package tutorconecta.com.example.tutorconectaapi.controllers;

import tutorconecta.com.example.tutorconectaapi.dtos.UsuarioRequestDTO;
import tutorconecta.com.example.tutorconectaapi.dtos.UsuarioResponseDTO;
import tutorconecta.com.example.tutorconectaapi.services.UsuarioService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'TUTOR')")
    public ResponseEntity<List<UsuarioResponseDTO>> listarUsuarios() {
        return ResponseEntity.ok(usuarioService.listarTodos());
    }

    @PostMapping
    public ResponseEntity<UsuarioResponseDTO> crearUsuario(@Valid @RequestBody UsuarioRequestDTO request) {
        UsuarioResponseDTO creado = usuarioService.crear(request);
        return ResponseEntity.created(URI.create("/api/usuarios/" + creado.getIdUsuario())).body(creado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> obtenerPorId(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(usuarioService.buscarPorId(id));
        } catch (EntityNotFoundException exception) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioResponseDTO> actualizarUsuario(
            @PathVariable Long id, @Valid @RequestBody UsuarioRequestDTO request) {
        try {
            return ResponseEntity.ok(usuarioService.actualizar(id, request));
        } catch (EntityNotFoundException exception) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
        try {
            usuarioService.eliminar(id);
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException exception) {
            return ResponseEntity.notFound().build();
        }
    }
}
