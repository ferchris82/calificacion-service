package chrisferdev.calificacion.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import chrisferdev.calificacion.entities.Calificacion;


public interface CalificacionRepository extends MongoRepository<Calificacion,String> { //String o Long
    
    List<Calificacion> findByUsuarioId(String usuarioId);

    List<Calificacion> findByHotelId(String hotelId);
}
