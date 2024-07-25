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
@Table(name = "mmenumoduloapp")
public class MenumoduloEntity {
    @Id
    @SequenceGenerator(name = "sq_menumodulo", sequenceName = "sq_menumodulo", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_menumodulo")
    @Column(name = "idmenumodulo")
    private Integer idmenumodulo;

    @Column(name = "desmenumodulo")
    private String desmenumodulo;

    @Column(name = "nomimgmenumod")
    private String nomimgmenumod;

    @Column(name = "flgestado")
    private char flgestado;

    @Column(name = "rutacompmenumod")
    private String rutacompmenumod;

    @ManyToOne
    @JoinColumn(name = "idmodulo",  nullable = false)
    private ModuloEntity menumodulo;

    @JsonIgnore
    @OneToMany(mappedBy = "menumoduloapp")
    private Collection<MenudmoduloEntity> itemsDModulo = new ArrayList<>();
}
