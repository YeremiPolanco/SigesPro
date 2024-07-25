package ms.jiren.sigespro.service;

import ms.jiren.sigespro.repository.dao.ModuloDao;
import ms.jiren.sigespro.repository.entity.ModuloEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ModuloService {

    private final ModuloDao repository;

    public List<ModuloEntity> getAllModulos() {
        return repository.findAll();
    }

    public Optional<ModuloEntity> getModuloById(Integer id) {
        return repository.findById(id);
    }

    public ModuloEntity createModulo(ModuloEntity modulo) {
        return repository.save(modulo);
    }

    public ModuloEntity updateModulo(Integer id, ModuloEntity updatedModulo) {
        updatedModulo.setIdmodulo(id);
        return repository.save(updatedModulo);
    }

    public void deleteModulo(Integer id) {
        repository.deleteById(id);
    }
}