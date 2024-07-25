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
@Table(name = "maplicacion")
public class AplicacionEntity {
    @Id
    @SequenceGenerator(name = "sq_aplicacion", sequenceName = "sq_aplicacion", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_aplicacion")
    @Column(name = "idappl")
    private Integer idappl;

    @Column(name = "desappl")
    private String desappl;

    @Column(name = "flgestado")
    private char flgestado;

    @JsonIgnore
    @OneToMany(mappedBy = "aplicacionEntity")
    private Collection<ModuloEntity> itemsModulo=new ArrayList<>();


}
