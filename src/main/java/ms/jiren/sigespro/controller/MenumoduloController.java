package ms.jiren.sigespro.controller;

import ms.jiren.sigespro.repository.entity.MenumoduloEntity;
import ms.jiren.sigespro.service.MenumoduloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/menus")
public class MenumoduloController {

    private final MenumoduloService service;

    @GetMapping
    public List<MenumoduloEntity> getAllMenus() {
        return service.getAllMenus();
    }

    @GetMapping("/{id}")
    public Optional<MenumoduloEntity> getMenuById(@PathVariable Integer id) {
        return service.getMenuById(id);
    }

    @PostMapping
    public MenumoduloEntity createMenu(@RequestBody MenumoduloEntity menu) {
        System.out.println(menu);
        return service.createMenu(menu);
    }

    @PutMapping("/{id}")
    public MenumoduloEntity updateMenu(@PathVariable Integer id, @RequestBody MenumoduloEntity updatedMenu) {
        return service.updateMenu(id, updatedMenu);
    }

    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable Integer id) {
        service.deleteMenu(id);
    }
}