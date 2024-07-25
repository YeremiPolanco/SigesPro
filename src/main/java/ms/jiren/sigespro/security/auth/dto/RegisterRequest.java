package ms.jiren.sigespro.security.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String username;
    private String password;
    private Date feccreUsuario;
    private Time horcreUsuario;
    private String nomcreaUsuario;
    private char flgIngreso;
    private char flgEstado;
    private Date fecmodUsuario;
    private Time hormodUsuario;
    private String nommodUsuario;
    private Integer idpersonal;
    private Set<Integer> perfilIds;  // Asumiendo que se enviarán los IDs de los perfiles
}
