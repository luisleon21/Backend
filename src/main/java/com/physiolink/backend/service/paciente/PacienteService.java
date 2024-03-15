package com.physiolink.backend.service.paciente;

import com.physiolink.backend.model.paciente.Paciente;
import com.physiolink.backend.model.tipoDocumento.TipoDocumento;
import com.physiolink.backend.repository.paciente.IPacienteRepository;
import com.physiolink.backend.repository.tipoDocumento.ITipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PacienteService implements IPacienteService{

    @Autowired
    IPacienteRepository repository;

    @Override
    public Optional<Paciente> getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Paciente> getAll() {
        return repository.getAll();
    }

    @Override
    public boolean post(Paciente paciente) {
        return repository.post(paciente);
    }

    @Override
    public boolean put(Paciente paciente) {
        return repository.put(paciente);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }
}
