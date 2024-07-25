package ms.jiren.sigespro.security.auth;

import ms.jiren.sigespro.repository.dao.UsuarioDao;
import ms.jiren.sigespro.repository.entity.PerfilEntity;
import ms.jiren.sigespro.repository.entity.UsuarioEntity;
import ms.jiren.sigespro.security.auth.dto.AuthResponse;
import ms.jiren.sigespro.security.auth.dto.LoginRequest;
import ms.jiren.sigespro.security.auth.dto.RegisterRequest;
import lombok.RequiredArgsConstructor;
import ms.jiren.sigespro.security.jwt.JwtService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UsuarioDao userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;



    public AuthResponse register(RegisterRequest request) {
        Set<PerfilEntity> perfiles = request.getPerfilIds() != null ?
                request.getPerfilIds().stream().map(id -> {
                    PerfilEntity perfil = new PerfilEntity();
                    perfil.setIdperfil(id);
                    return perfil;
                }).collect(Collectors.toSet()) : new HashSet<>();

        UsuarioEntity user = UsuarioEntity.builder()
                .nomusuario(request.getUsername())
                .passusuario(passwordEncoder.encode(request.getPassword()))
                .feccreUsuario(request.getFeccreUsuario())
                .horcreUsuario(request.getHorcreUsuario())
                .nomcreaUsuario(request.getNomcreaUsuario())
                .flgIngreso(request.getFlgIngreso())
                .flgEstado(request.getFlgEstado())
                .fecmodUsuario(request.getFecmodUsuario())
                .hormodUsuario(request.getHormodUsuario())
                .nommodUsuario(request.getNommodUsuario())
                .idpersonal(request.getIdpersonal())
                .itemsPerfil(perfiles)  // Aquí asignamos los perfiles
                .build();

        userRepository.save(user);

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();
    }
}
