package ms.jiren.sigespro.repository.entity;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "mmoduloapp")
public class ModuloEntity {
    @Id
    @SequenceGenerator(name = "sq_modulo", sequenceName = "sq_modulo", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_modulo")
    @Column(name = "idmodulo")
    private Integer idmodulo;

    @Column(name = "desmodulo")
    private String desmodulo;

    @Column(name = "nomimgmodulo")
    private String nomimgmodulo;

    @Column(name = "flgestado")
    private char flgestado;

    @ManyToOne
    @JoinColumn(name = "idappl", nullable = false)
    private AplicacionEntity aplicacionEntity;

    @JsonIgnore
    @OneToMany(mappedBy = "menumodulo")
    private Collection<MenumoduloEntity> itemsMenu=new ArrayList<>();


}

