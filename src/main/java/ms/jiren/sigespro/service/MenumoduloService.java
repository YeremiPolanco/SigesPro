package ms.jiren.sigespro.service;

import ms.jiren.sigespro.repository.dao.MenumoduloDao;
import ms.jiren.sigespro.repository.entity.MenumoduloEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class MenumoduloService {

    private final MenumoduloDao repository;

    public List<MenumoduloEntity> getAllMenus() {
        return repository.findAll();
    }

    public Optional<MenumoduloEntity> getMenuById(Integer id) {
        return repository.findById(id);
    }

    public MenumoduloEntity createMenu(MenumoduloEntity menu) {
        return repository.save(menu);
    }

    public MenumoduloEntity updateMenu(Integer id, MenumoduloEntity updatedMenu) {
        updatedMenu.setIdmenumodulo(id);
        return repository.save(updatedMenu);
    }

    public void deleteMenu(Integer id) {
        repository.deleteById(id);
    }
}