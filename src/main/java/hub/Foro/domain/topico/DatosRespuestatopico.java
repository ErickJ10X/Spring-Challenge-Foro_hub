package hub.Foro.domain.topico;

import hub.Foro.domain.usuario.Usuario;


import java.util.Date;

public record DatosRespuestatopico(
        Long id,
        String titulo,
        String mensaje,
        Date fechaCreacion,
        Usuario autor,
        String curso
) {
}
