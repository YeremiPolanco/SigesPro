package ms.jiren.sigespro.repository.dao;

import ms.jiren.sigespro.repository.entity.PerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilDao extends JpaRepository<PerfilEntity, Integer> {
}
