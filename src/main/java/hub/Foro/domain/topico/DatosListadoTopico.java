package hub.Foro.domain.topico;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechacreacion,
        String autor,
        String curso
) {

        public DatosListadoTopico(Topico topico) {
            this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getAutor(), topico.getCurso());
        }
}
