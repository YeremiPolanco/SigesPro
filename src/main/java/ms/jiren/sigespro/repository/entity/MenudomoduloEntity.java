package ms.jiren.sigespro.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "mmenudomoduloapp")
public class MenudomoduloEntity {
    @Id
    @SequenceGenerator(name = "sq_menudomodulo", sequenceName = "sq_menudomodulo", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_menudomodulo")
    @Column(name = "idmenudomodulo")
    private Integer idmenudomodulo;

    @Column(name = "desmenudomodulo")
    private String desmenudomodulo;

    @Column(name = "nomimgmenudomod")
    private String nomimgmenudomod;

    @Column(name = "flgestado")
    private char flgestado;

    @Column(name = "rutacompmenudomod")
    private String rutacompmenudomod;

    @ManyToOne
    @JoinColumn(name = "idmenudmodulo",  nullable = false)
    private MenudmoduloEntity menudmoduloapp;

    @JsonIgnore
    @OneToMany(mappedBy = "menuDoModulo")
    private Collection<PerfilMenuEntity> itemsPerfilMenu = new ArrayList<>();
}
