package ms.jiren.sigespro.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "mperfil")
public class PerfilEntity {
    @Id
    @SequenceGenerator(name = "sq_perfil", sequenceName = "sq_perfil", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_perfil")
    @Column(name = "idperfil")
    private Integer idperfil;

    @Column(name = "desperfil")
    private String desperfil;

    @Column(name = "flgestado")
    private char flgestado;

    @Column(name = "nomperfil")
    private String nomperfil;

    @ManyToMany(mappedBy="itemsPerfil")
    private Set<UsuarioEntity> itemsUsuario=new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "perfilEntity")
    private Collection<PerfilMenuEntity> itemsPerfiMenu=new ArrayList<>();
}
