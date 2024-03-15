package com.physiolink.backend.service.alerta;

import com.physiolink.backend.model.alerta.Alerta;
import com.physiolink.backend.model.paciente.Paciente;

import java.util.List;
import java.util.Optional;

public interface IAlertaService {
    Optional<Alerta> getById(int id);
    List<Alerta> getAll();
    boolean post(Alerta alerta);
    boolean put(Alerta alerta);
    boolean delete(int id);
}
