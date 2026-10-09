package ec.com.leodev.tdd.mockito.repository;

import ec.com.leodev.tdd.mockito.model.Examen;

import java.util.List;

public interface ExamenRepository {
    List<Examen> findAll();

    Examen guardar(Examen examen);
}
