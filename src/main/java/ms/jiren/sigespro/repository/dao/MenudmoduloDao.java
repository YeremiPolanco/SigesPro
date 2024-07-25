package ms.jiren.sigespro.repository.dao;

import ms.jiren.sigespro.repository.entity.MenudmoduloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenudmoduloDao extends JpaRepository<MenudmoduloEntity, Integer> {
}
