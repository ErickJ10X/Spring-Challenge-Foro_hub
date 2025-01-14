package hub.Foro.domain.topico;


import hub.Foro.domain.usuario.DatosRespuestaUsuario;
import hub.Foro.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record DatosRespuestatopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fecha,
        DatosRespuestaUsuario autor,
        String curso
) {
}
