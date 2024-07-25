package ms.jiren.sigespro.repository.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "mperfilmenu")
public class PerfilMenuEntity {
    @Id
    @SequenceGenerator(name = "sq_perfilmenu", sequenceName = "sq_perfilmenu", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_perfilmenu")
    @Column(name = "idperfilmenu")
    private Integer idPerfiMenu;

    @Column(name = "flgestado")
    private char flgestado;

    @ManyToOne
    @JoinColumn(name = "idperfil", nullable = false)
    private PerfilEntity perfilEntity;

    @ManyToOne
    @JoinColumn(name = "idmenumodulo",  nullable = false)
    private MenumoduloEntity menumoduloapp;

    @ManyToOne
    @JoinColumn(name = "idmenudmodulo",  nullable = false)
    private MenudmoduloEntity menudmoduloapp;

    @ManyToOne
    @JoinColumn(name = "idmenudomodulo",  nullable = false)
    private MenudomoduloEntity menuDoModulo;


}
