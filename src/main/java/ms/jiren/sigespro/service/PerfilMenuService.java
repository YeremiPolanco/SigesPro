package ms.jiren.sigespro.service;

import ms.jiren.sigespro.repository.dao.PerfilMenuDao;
import ms.jiren.sigespro.repository.entity.PerfilMenuEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PerfilMenuService {
    private final PerfilMenuDao repository;

    public List<PerfilMenuEntity> getAllPerfiles() {
        return repository.findAll();
    }

    public Optional<PerfilMenuEntity> getPerfilById(Integer id) {
        return repository.findById(id);
    }

    public PerfilMenuEntity createPerfil(PerfilMenuEntity perfil) {
        return repository.save(perfil);
    }

    public PerfilMenuEntity updatePerfil(Integer id, PerfilMenuEntity updatedPerfil) {
        updatedPerfil.setIdPerfiMenu(id);
        return repository.save(updatedPerfil);
    }

    public void deletePerfil(Integer id) {
        repository.deleteById(id);
    }
}
