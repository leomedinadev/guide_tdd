package ec.com.leodev.tdd.spt.repository;

import ec.com.leodev.tdd.spt.models.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IBancoRepository extends JpaRepository<Banco, Long> {

    List<Banco> findAll();

    Optional<Banco> findById(Long id);

//    void update(Banco banco);
}
