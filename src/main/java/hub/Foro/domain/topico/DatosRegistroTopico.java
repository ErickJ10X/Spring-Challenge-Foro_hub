package hub.Foro.domain.topico;

import hub.Foro.domain.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        Date fechaCreacion,
        @NotBlank
        Usuario autor,
        @NotBlank
        String curso
) {
}
