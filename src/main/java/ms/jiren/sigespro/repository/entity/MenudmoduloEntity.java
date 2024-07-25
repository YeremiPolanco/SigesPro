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
@Table(name = "mmenudmoduloapp")
public class MenudmoduloEntity {
    @Id
    @SequenceGenerator(name = "sq_menudmodulo", sequenceName = "sq_menudmodulo", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_menudmodulo")
    @Column(name = "idmenudmodulo")
    private Integer idmenudmodulo;

    @Column(name = "desmenudmodulo")
    private String desmenudmodulo;

    @Column(name = "nomimgmenudmod")
    private String nomimgmenumod;

    @Column(name = "flgestado")
    private char flgestado;

    @Column(name = "rutacompmenudmod")
    private String rutacompmenudmod;

    @ManyToOne
    @JoinColumn(name = "idmenumodulo",  nullable = false)
    private MenumoduloEntity menumoduloapp;

    @JsonIgnore
    @OneToMany(mappedBy = "menudmoduloapp")
    private Collection<MenudomoduloEntity> itemsDoModulo = new ArrayList<>();
}
