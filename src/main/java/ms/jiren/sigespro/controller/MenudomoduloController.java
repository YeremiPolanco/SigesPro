package ms.jiren.sigespro.controller;

import ms.jiren.sigespro.repository.entity.MenudomoduloEntity;
import ms.jiren.sigespro.service.MenudomoduloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/menusdo")
public class MenudomoduloController {
    private final MenudomoduloService service;

    @GetMapping
    public List<MenudomoduloEntity> getAllMenus() {
        return service.getAllMenus();
    }

    @GetMapping("/{id}")
    public Optional<MenudomoduloEntity> getMenuById(@PathVariable Integer id) {
        return service.getMenuById(id);
    }

    @PostMapping
    public MenudomoduloEntity createMenu(@RequestBody MenudomoduloEntity menu) {
        System.out.println(menu);
        return service.createMenu(menu);
    }

    @PutMapping("/{id}")
    public MenudomoduloEntity updateMenu(@PathVariable Integer id, @RequestBody MenudomoduloEntity updatedMenu) {
        return service.updateMenu(id, updatedMenu);
    }

    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable Integer id) {
        service.deleteMenu(id);
    }
}
