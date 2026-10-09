package ec.com.leodev.tdd.spt.service;

import ec.com.leodev.tdd.spt.models.Cuenta;

import java.math.BigDecimal;
import java.util.List;

public interface ICuentaService {

    List<Cuenta> findAll();
    Cuenta findById(Long id);

    Cuenta save(Cuenta cuenta);

    void deleteById(Long id);

    int revisarTotalTransferencias(Long bancoId);

    BigDecimal revisarSaldo(Long cuentaId);

    void transferir(Long numCuentaOrigen, Long numCuentaDestino, BigDecimal monto,
                    Long bancoId);
}
