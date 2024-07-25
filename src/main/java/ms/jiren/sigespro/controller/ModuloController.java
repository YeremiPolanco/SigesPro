package ms.jiren.sigespro.controller;

import ms.jiren.sigespro.repository.entity.ModuloEntity;
import ms.jiren.sigespro.service.ModuloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/modulos")
public class ModuloController {

    private final ModuloService service;

    @GetMapping
    public List<ModuloEntity> getAllModulos() {
        return service.getAllModulos();
    }

    @GetMapping("/{id}")
    public Optional<ModuloEntity> getModuloById(@PathVariable Integer id) {
        return service.getModuloById(id);
    }

    @PostMapping
    public ModuloEntity createModulo(@RequestBody ModuloEntity modulo) {
        System.out.println(modulo);
        return service.createModulo(modulo);
    }

    @PutMapping("/{id}")
    public ModuloEntity updateModulo(@PathVariable Integer id, @RequestBody ModuloEntity updatedModulo) {
        return service.updateModulo(id, updatedModulo);
    }

    @DeleteMapping("/{id}")
    public void deleteModulo(@PathVariable Integer id) {
        service.deleteModulo(id);
    }
}
