package hub.Foro.domain.topico;

import hub.Foro.domain.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "topicos")
@Entity(name = "Topico")
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    private Long id;
    private String titulo;
    private String mensaje;
    private Date fechaCreacion;
    private boolean status;
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario autor;
    private String curso;

    public Topico(@Valid DatosRegistroTopico datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fechaCreacion = datosRegistroTopico.fechaCreacion();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();
    }

    public void actualizarDatos(@Valid DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null)
            this.titulo = datosActualizarTopico.titulo();
        if (datosActualizarTopico.mensaje() != null)
            this.mensaje = datosActualizarTopico.mensaje();
        if (datosActualizarTopico.curso() != null)
            this.curso = datosActualizarTopico.curso();
    }
}
