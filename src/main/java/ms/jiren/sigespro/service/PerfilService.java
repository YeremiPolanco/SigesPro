package ms.jiren.sigespro.service;

import ms.jiren.sigespro.repository.dao.PerfilDao;
import ms.jiren.sigespro.repository.entity.PerfilEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PerfilService {

    private final PerfilDao repository;

    public List<PerfilEntity> getAllPerfiles() {
        return repository.findAll();
    }

    public Optional<PerfilEntity> getPerfilById(Integer id) {
        return repository.findById(id);
    }

    public PerfilEntity createPerfil(PerfilEntity perfil) {
        return repository.save(perfil);
    }

    public PerfilEntity updatePerfil(Integer id, PerfilEntity updatedPerfil) {
        updatedPerfil.setIdperfil(id);
        return repository.save(updatedPerfil);
    }

    public void deletePerfil(Integer id) {
        repository.deleteById(id);
    }
}
