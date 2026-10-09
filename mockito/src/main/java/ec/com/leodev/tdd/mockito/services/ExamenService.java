package ec.com.leodev.tdd.mockito.services;

import ec.com.leodev.tdd.mockito.model.Examen;

import java.util.Optional;

public interface ExamenService {

    Optional<Examen> findExamenPorNombre(String nombre);

    Examen findExamenPorNombreConPreguntas(String nombre);

    Examen guardar(Examen examen);
}
