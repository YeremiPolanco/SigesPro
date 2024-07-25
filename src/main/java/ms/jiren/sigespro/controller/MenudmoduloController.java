package ms.jiren.sigespro.controller;

import ms.jiren.sigespro.repository.entity.MenudmoduloEntity;
import ms.jiren.sigespro.service.MenudmoduloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/menusd")
public class MenudmoduloController {
    private final MenudmoduloService service;

    @GetMapping
    public List<MenudmoduloEntity> getAllMenus() {
        return service.getAllMenus();
    }

    @GetMapping("/{id}")
    public Optional<MenudmoduloEntity> getMenuById(@PathVariable Integer id) {
        return service.getMenuById(id);
    }

    @PostMapping
    public MenudmoduloEntity createMenu(@RequestBody MenudmoduloEntity menu) {
        return service.createMenu(menu);
    }

    @PutMapping("/{id}")
    public MenudmoduloEntity updateMenu(@PathVariable Integer id, @RequestBody MenudmoduloEntity updatedMenu) {
        return service.updateMenu(id, updatedMenu);
    }

    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable Integer id) {
        service.deleteMenu(id);
    }
}
