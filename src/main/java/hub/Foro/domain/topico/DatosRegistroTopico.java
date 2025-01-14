package hub.Foro.domain.topico;

import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String fechacreacion,
        @NotBlank
        String autor,
        @NotBlank
        String curso
) {
}
