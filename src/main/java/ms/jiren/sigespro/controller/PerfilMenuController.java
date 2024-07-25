package ms.jiren.sigespro.controller;

import ms.jiren.sigespro.repository.entity.PerfilMenuEntity;
import ms.jiren.sigespro.service.PerfilMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/perfilMenu")
public class PerfilMenuController {
    private final PerfilMenuService service;

    @GetMapping
    public List<PerfilMenuEntity> getAllPerfiles() {
        return service.getAllPerfiles();
    }

    @GetMapping("/{id}")
    public Optional<PerfilMenuEntity> getPerfilById(@PathVariable Integer id) {
        return service.getPerfilById(id);
    }

    @PostMapping
    public PerfilMenuEntity createPerfil(@RequestBody PerfilMenuEntity perfil) {
        return service.createPerfil(perfil);
    }

    @PutMapping("/{id}")
    public PerfilMenuEntity updatePerfil(@PathVariable Integer id, @RequestBody PerfilMenuEntity updatedPerfil) {
        return service.updatePerfil(id, updatedPerfil);
    }

    @DeleteMapping("/{id}")
    public void deletePerfil(@PathVariable Integer id) {
        service.deletePerfil(id);
    }
}
