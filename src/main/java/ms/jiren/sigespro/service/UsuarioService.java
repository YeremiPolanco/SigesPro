package ms.jiren.sigespro.service;

import ms.jiren.sigespro.repository.dao.UsuarioDao;
import ms.jiren.sigespro.repository.entity.UsuarioEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UsuarioService {

    private final UsuarioDao repository;

    public List<UsuarioEntity> getAllUsuarios() {
        return repository.findAll();
    }

    public Optional<UsuarioEntity> getUsuarioById(Integer id) {
        return repository.findById(id);
    }

    public UsuarioEntity createUsuario(UsuarioEntity usuario) {
        return repository.save(usuario);
    }

    public UsuarioEntity updateUsuario(Integer id, UsuarioEntity updatedUsuario) {
        updatedUsuario.setIdusuario(id);
        return repository.save(updatedUsuario);
    }

    public void deleteUsuario(Integer id) {
        repository.deleteById(id);
    }

    public void deleteRowPerfilUsuario(Integer idusuario, Integer idperfil){
        repository.deleteRowPerfilUsuario(idusuario, idperfil);
    }
}
