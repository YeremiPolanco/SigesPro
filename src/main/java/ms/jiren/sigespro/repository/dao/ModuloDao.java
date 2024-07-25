package ms.jiren.sigespro.repository.dao;

import ms.jiren.sigespro.repository.entity.ModuloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuloDao extends JpaRepository<ModuloEntity, Integer> {

}