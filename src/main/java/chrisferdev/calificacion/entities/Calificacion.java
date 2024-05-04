package chrisferdev.calificacion.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("calificaciones")
public class Calificacion {
    
    @Id
    private String calificacionId;
    private String usuarioId;
    private String hotelId;
    private Long calificacion;
    private String observaciones;
}
