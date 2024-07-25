package ms.jiren.sigespro.repository.dao;

import ms.jiren.sigespro.repository.entity.PerfilMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilMenuDao extends JpaRepository<PerfilMenuEntity, Integer> {
}
