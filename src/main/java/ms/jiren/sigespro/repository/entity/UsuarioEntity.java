package ms.jiren.sigespro.repository.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Time;
import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "musuario")
public class UsuarioEntity implements UserDetails {
    @Id
    @SequenceGenerator(name = "sq_usuario", sequenceName = "sq_usuario", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_usuario")
    @Column(name = "idusuario")
    private Integer idusuario;

    @Column(name = "nomusuario")
    private String nomusuario;

    @Column(name = "passusuario")
    private String passusuario;

    @Column(name = "feccre_usuario")
    private Date feccreUsuario;

    @Column(name = "horcre_usuario")
    private Time horcreUsuario;

    @Column(name = "nomcrea_usuario")
    private String nomcreaUsuario;

    @Column(name = "flg_ingreso")
    private char flgIngreso;

    @Column(name = "flg_estado")
    private char flgEstado;

    @Column(name = "fecmod_usuario")
    private Date fecmodUsuario;

    @Column(name = "hormod_usuario")
    private Time hormodUsuario;

    @Column(name = "nommod_usuario")
    private String nommodUsuario;

    @Column(name = "idpersonal")
    private Integer idpersonal;

    @ManyToMany
    @JoinTable(name = "mperfilusuario",
            joinColumns = @JoinColumn(name = "idusuario"),
            inverseJoinColumns = @JoinColumn(name = "idperfil"))
    private Set<PerfilEntity> itemsPerfil = new HashSet<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (PerfilEntity perfil : itemsPerfil) {
            authorities.add(new SimpleGrantedAuthority(perfil.getNomperfil()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return passusuario;
    }

    @Override
    public String getUsername() {
        return nomusuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return flgEstado == '1';
    }
}
