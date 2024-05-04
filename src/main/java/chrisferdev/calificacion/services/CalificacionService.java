package chrisferdev.calificacion.services;

import java.util.List;

import chrisferdev.calificacion.entities.Calificacion;

public interface CalificacionService {
    
    Calificacion create(Calificacion calificacion);

    List<Calificacion> getCalificaciones();

    List<Calificacion> getCalificacionesByUsuarioId(String usuarioId);

    List<Calificacion> getCalificacionesByHotelId(String hotelId);
}
