package ms.jiren.sigespro.service;

import ms.jiren.sigespro.repository.dao.AplicacionDao;
import ms.jiren.sigespro.repository.entity.AplicacionEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class AplicacionService {


    private final AplicacionDao repository;

    public List<AplicacionEntity> getAllApplications() {
        return repository.findAll();
    }

    public Optional<AplicacionEntity> getApplicationById(Integer id) {
        return repository.findById(id);
    }

    public AplicacionEntity createOrUpdateApplication(AplicacionEntity application) {
        return repository.save(application);
    }

    public void deleteApplicationById(Integer id) {
        repository.deleteById(id);
    }
}