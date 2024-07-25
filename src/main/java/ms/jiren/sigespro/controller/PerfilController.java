package ms.jiren.sigespro.controller;

import ms.jiren.sigespro.repository.entity.PerfilEntity;
import ms.jiren.sigespro.service.PerfilService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/perfil")
public class PerfilController {

    private final PerfilService service;

    @GetMapping
    public List<PerfilEntity> getAllPerfiles() {
        return service.getAllPerfiles();
    }

    @GetMapping("/{id}")
    public Optional<PerfilEntity> getPerfilById(@PathVariable Integer id) {
        return service.getPerfilById(id);
    }

    @PostMapping
    public PerfilEntity createPerfil(@RequestBody PerfilEntity perfil) {
        return service.createPerfil(perfil);
    }

    @PutMapping("/{id}")
    public PerfilEntity updatePerfil(@PathVariable Integer id, @RequestBody PerfilEntity updatedPerfil) {
        return service.updatePerfil(id, updatedPerfil);
    }

    @DeleteMapping("/{id}")
    public void deletePerfil(@PathVariable Integer id) {
        service.deletePerfil(id);
    }
}
