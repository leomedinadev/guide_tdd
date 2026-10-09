package ec.com.leodev.tdd.mockito.repository;

import java.util.List;

public interface PreguntaRepository {

    List<String> findPreguntasPorExamenId(Long id);

    void guardarVarias(List<String> preguntas);
}
