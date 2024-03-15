package com.physiolink.backend.repository.paciente;

import com.physiolink.backend.model.paciente.Paciente;
import com.physiolink.backend.model.tipoDocumento.TipoDocumento;

import java.util.List;
import java.util.Optional;

public interface IPacienteRepository {
    Optional<Paciente> getById(int id);
    List<Paciente> getAll();
    boolean post(Paciente paciente);
    boolean put(Paciente paciente);
    boolean delete(int id);
}
