package ms.jiren.sigespro.service;

import ms.jiren.sigespro.repository.dao.MenudmoduloDao;
import ms.jiren.sigespro.repository.entity.MenudmoduloEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class MenudmoduloService {

    private final MenudmoduloDao repository;

    public List<MenudmoduloEntity> getAllMenus() {
        return repository.findAll();
    }

    public Optional<MenudmoduloEntity> getMenuById(Integer id) {
        return repository.findById(id);
    }

    public MenudmoduloEntity createMenu(MenudmoduloEntity menu) {
        return repository.save(menu);
    }

    public MenudmoduloEntity updateMenu(Integer id, MenudmoduloEntity updatedMenu) {
        updatedMenu.setIdmenudmodulo(id);
        return repository.save(updatedMenu);
    }

    public void deleteMenu(Integer id) {
        repository.deleteById(id);
    }
}
