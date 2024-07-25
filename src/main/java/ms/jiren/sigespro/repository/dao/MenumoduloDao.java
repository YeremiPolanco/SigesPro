package ms.jiren.sigespro.repository.dao;

import ms.jiren.sigespro.repository.entity.MenumoduloEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenumoduloDao extends JpaRepository<MenumoduloEntity, Integer> {

}

