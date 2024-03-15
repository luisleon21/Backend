package com.physiolink.backend.repository.alerta;

import com.physiolink.backend.model.alerta.Alerta;

import java.util.List;
import java.util.Optional;

public interface IAlertaRepository {
    Optional<Alerta> getById(int id);
    List<Alerta> getAll();
    boolean post(Alerta alerta);
    boolean put(Alerta alerta);
    boolean delete(int id);
}
