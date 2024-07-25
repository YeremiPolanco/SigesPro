package ms.jiren.sigespro.service;

import ms.jiren.sigespro.repository.dao.MenudomoduloDao;
import ms.jiren.sigespro.repository.entity.MenudomoduloEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MenudomoduloService {
    private final MenudomoduloDao repository;

    public List<MenudomoduloEntity> getAllMenus() {
        return repository.findAll();
    }

    public Optional<MenudomoduloEntity> getMenuById(Integer id) {
        return repository.findById(id);
    }

    public MenudomoduloEntity createMenu(MenudomoduloEntity menu) {
        return repository.save(menu);
    }

    public MenudomoduloEntity updateMenu(Integer id, MenudomoduloEntity updatedMenu) {
        updatedMenu.setIdmenudomodulo(id);
        return repository.save(updatedMenu);
    }

    public void deleteMenu(Integer id) {
        repository.deleteById(id);
    }
}
