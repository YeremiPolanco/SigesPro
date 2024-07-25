package ms.jiren.sigespro.controller;

import ms.jiren.sigespro.repository.entity.UsuarioEntity;
import ms.jiren.sigespro.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService service;

    @GetMapping
    public List<UsuarioEntity> getAllUsuarios() {
        return service.getAllUsuarios();
    }

    @GetMapping("/{id}")
    public Optional<UsuarioEntity> getUsuarioById(@PathVariable Integer id) {
        return service.getUsuarioById(id);
    }

    @PostMapping
    public UsuarioEntity createUsuario(@RequestBody UsuarioEntity usuario) {
        return service.createUsuario(usuario);
    }

    @PutMapping("/{id}")
    public UsuarioEntity updateUsuario(@PathVariable Integer id, @RequestBody UsuarioEntity updatedUsuario) {
        return service.updateUsuario(id, updatedUsuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Integer id) {
        service.deleteUsuario(id);
    }

    @DeleteMapping("/usuario/{idusuario}/perfil/{idperfil}")
    public void deleteRowPerfilUsuario(@PathVariable Integer idusuario, @PathVariable Integer idperfil) {
        service.deleteRowPerfilUsuario(idusuario, idperfil);
    }
}
