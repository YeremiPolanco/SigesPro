package ms.jiren.sigespro.repository.dao;

import ms.jiren.sigespro.repository.entity.UsuarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioDao extends JpaRepository<UsuarioEntity, Integer> {
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM mperfilusuario WHERE idusuario = ?1 AND idperfil = ?2", nativeQuery = true)
    void deleteRowPerfilUsuario(Integer idUsuario, Integer idPerfil);

    Optional<UsuarioEntity> findByNomusuario(String nomusuario);
}


