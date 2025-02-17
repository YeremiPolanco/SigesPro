package ms.jiren.sigespro.repository.dao;

import ms.jiren.sigespro.repository.entity.AplicacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AplicacionDao extends JpaRepository<AplicacionEntity, Integer> {

}
